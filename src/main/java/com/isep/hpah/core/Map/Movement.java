package com.isep.hpah.core.Map;


import com.isep.hpah.Game.Book;
import com.isep.hpah.Game.Game;
import com.isep.hpah.core.*;
import com.isep.hpah.gameMecanics.Battle;

import java.util.Arrays;
import java.util.List;

import static com.isep.hpah.core.Map.Map.MAP_SIZE;
import static com.isep.hpah.core.logic.GameLogic.getTextInput;

public class Movement {
    private Map map;


    public static void movePlayer(Wizard player, Map map, String direction){

        int[] Position = {player.getPosition()[0], player.getPosition()[1]};

        switch (direction) {
            case ("down") -> {
                if (isMovementPossible(player,0,1)) {
                    player.setPosition(Position[0] + 1, Position[1]);

                }
            }
            case ("up") -> {
                if (isMovementPossible(player,0 , -1)) {
                    player.setPosition(Position[0] - 1, Position[1]);

                }
            }

            case ("left") -> {
                if (isMovementPossible(player, 1,-1)) {
                    player.setPosition(Position[0], Position[1]  - 1);

                } }

            case ("right") -> {
                if (isMovementPossible(player,1,1)) {
                    player.setPosition(Position[0], Position[1]  + 1);


                }
            }



        }

    }
    public static boolean isMovementPossible(Wizard player, int rowOrColumn /* 0 are row and 1 are column*/, int direction){
       return  (player.getPosition()[rowOrColumn]+ direction <= MAP_SIZE-1 && player.getPosition()[rowOrColumn]+ direction >= 0);
    }

    public static void getEncounter(Wizard player, Map map /*Game game*/, List<AbstractEnemy> enemies, List<AbstractEnemy> boss) {

        int squareColor = map.getSquare(player.getPosition()[0], player.getPosition()[1]);
        System.out.println(squareColor);

        switch (squareColor) {
            case 2 :
                Battle battle = new Battle(player, /*Arrays.asList(game.getBook().getEnemies())*/ enemies);
                battle.start();
                System.out.println("You overcame this year! Time to graduate!!!");
                break;
            case 6:
                Battle bossFight = new Battle(player,boss);
                bossFight.start();
            case 3 :
                //
                System.out.println("Shopping time !");
                System.out.println("The shop owner is a very generous man. He understands that most students don't have a lot of money");

                System.out.println("You were gifted three potions!");
                List<Potion> potions = player.getPotions();

               potions.add(new Potion("Gift from a kind person"));
                potions.add(new Potion("Gift from a kind person"));
                potions.add(new Potion("Gift from a kind person"));

                player.setPotions(potions);

                break;

            case 5 :
                System.out.println("Tavern !");
                System.out.println("The inn owner is a the parent of one of your friends!");
                System.out.println("They let you rest for free!");

                player.setHealthPoints(player.getMaxHealthPoints());
                player.setManaPoints(player.getMaxManaPoints());

                System.out.println("Mana and HP restored!");
                break;

            case 0:
                break;

            case 4:
                System.out.println("Your pet " + player.getPet().getPetName()+" is the cutest!");
                System.out.println("Their cuteness made you level up!");
                player.setLevel(player.getLevel()+5);

            default:
                System.out.println("No other option !");
        }



    }
    public static void visuallyMovePlayer(Map map, Wizard wizard){
        System.out.println("                             ");
        map.printBoard(map);
        map.clearSquare(wizard.getPosition()[0], wizard.getPosition()[1]);
        String direction = getTextInput();
        movePlayer(wizard, map, direction);
        map.fillSquare(wizard.getPosition()[0], wizard.getPosition()[1], 1);
        System.out.println(" ");
        map.printBoard(map);
    }

    public static void visuallyMove(Map map, Wizard wizard, String command){
        System.out.println("                             ");
        map.printBoard(map);
        map.clearSquare(wizard.getPosition()[0], wizard.getPosition()[1]);

        movePlayer(wizard, map, command);
        map.fillSquare(wizard.getPosition()[0], wizard.getPosition()[1], 1);
        System.out.println(" ");
        map.printBoard(map);
    }

}
