package com.isep.hpah.core.Map;


import com.isep.hpah.Game.Book;
import com.isep.hpah.core.Wizard;

import java.lang.reflect.Array;
import java.util.List;

import static com.isep.hpah.core.Map.Map.MAP_SIZE;

public class Movement {
    private Map map;


    public static void movePlayer(Wizard player, Map map, String direction){

        int[] Position = {player.getPosition()[0], player.getPosition()[1]};

        switch (direction) {
            case ("down") -> {
                if (checkMovement(player,0,1)) {
                    player.setPosition(Position[0] + 1, Position[1]);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");
                }
            }
            case ("up") -> {
                if (checkMovement(player,0 , -1)) {
                    player.setPosition(Position[0] - 1, Position[1]);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");

                }
            }

            case ("left") -> {
                if (checkMovement(player, 1,-1)) {
                    player.setPosition(Position[0], Position[1]  - 1);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");

                }
            }

            case ("right") -> {
                if (checkMovement(player,0,1)) {
                    player.setPosition(Position[0], Position[1]  + 1);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");

                }
            }

            default -> {
                System.out.println("no direction chosen");
            }

        }

    }
    public static boolean checkMovement(Wizard player, int rowOrColumn /* 0 are row and 1 are column*/, int direction){
        boolean movementPossible;
        int max = MAP_SIZE;

       return  (player.getPosition()[rowOrColumn]+ direction <= MAP_SIZE && player.getPosition()[rowOrColumn]+ direction >= 0);


    }

    public String getEncounter(Book book, int[] position){

        int row= position[0];
        int column=position[1];


return "";

    }

    public void placeEncounter(String encounter, int[] position){
        int row= position[0];
        int column=position[1];


    }

}
