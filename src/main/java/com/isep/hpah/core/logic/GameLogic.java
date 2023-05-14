package com.isep.hpah.core.logic;

import com.isep.hpah.Game.Game;
import com.isep.hpah.core.Boss;
import com.isep.hpah.core.Enemy;
import com.isep.hpah.core.Map.Map;
import com.isep.hpah.core.Spell;
import com.isep.hpah.core.Wizard;

import java.util.List;
import java.util.Scanner;

import static com.isep.hpah.core.Map.Movement.getEncounter;
import static com.isep.hpah.core.Map.Movement.visuallyMove;
import static com.isep.hpah.gameMecanics.Battle.isBossFight;

public class GameLogic {

    public static boolean isGameOver;
    static Scanner scanner = new Scanner(System.in);
    static boolean isRunning=true;
    public static Wizard player;


    public Enemy[] enemies;
    public Boss[] bosses;

//Come on,  be serious
   /* public void randomEncounters(){
        int encounter = (int) (Math.random()* encounters.length);
    }*/

    public static String getTextInput() {
        String input;
        input = scanner.next();
        return input;
    }

    public static int nextInt(){
        return scanner.nextInt();
    }
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    public void fullHp(Wizard player){
        player.setHealthPoints(player.getMaxHealthPoints());
    }

    public static void characterInfo(Wizard player){
        System.out.println("Name" + player.getCharacterName());
        System.out.println(player.getHealthPoints()+ " / "+ player.getMaxHealthPoints() +" HP");
        System.out.println(player.getManaPoints()+ " / "+ player.getMaxManaPoints() +" MP");
        System.out.println("Pet" + player.getPet());
        System.out.println("Wand core" + player.getWand().getCore());
        System.out.println("Wand size" + player.getWand().getSize());
        System.out.println("Number of potions" + player.getPotions().size());



    }
    public static void printMenu(){
        System.out.println("Choose an action");
        System.out.println("1: Continue your studies");
        System.out.println("2: Character info");
        System.out.println("3: Exit Game");
    }

    public static void displayList(List list) {

        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i);
            System.out.println(i + ": " + item+ list.get(i));
        }
    }

    public static void displaySpellList(List<Spell> list) {

        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i);
            System.out.println(i + ": " + item+ list.get(i).getSpellName());
        }
    }

    public static void gameLoop(Wizard player, Map map, Game game) {



        while (isRunning) {

            String command = getTextInput();

            if (command.equals("menu")) {
                printMenu();
                int input = readInt("->", 3);
                if (input == 1) {
                    // continueJourney();
                } else if (input == 2) {
                    characterInfo(player);
                } else {
                    isRunning = false;
                    isGameOver=true;

                    break;
                }
            } else {
                visuallyMove(map, player,  command);
                getEncounter(player, map, (game.getBook(game.currentBook)).getEnemies(), game.getBook(game.currentBook).getBoss());

                if(isBossFight == true && isGameOver==false){
                    game.setCurrentBook(game.getCurrentBook()+1);
                    game.getBook(game.getCurrentBook());

                }

            }
        }
    }

}

