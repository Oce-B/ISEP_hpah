package com.isep.hpah.core.Map;


import com.isep.hpah.Game.Book;
import com.isep.hpah.core.Wizard;

import java.lang.reflect.Array;
import java.util.List;

import static com.isep.hpah.core.Map.Map.MAP_SIZE;
import static com.isep.hpah.core.logic.GameLogic.getTextInput;

public class Movement {
    private Map map;


    public static void movePlayer(Wizard player, Map map, String direction){

        int[] Position = {player.getPosition()[0], player.getPosition()[1]};

        switch (direction) {
            case ("down") -> {
                if (checkMovement(player,0,1)) {
                    player.setPosition(Position[0] + 1, Position[1]);

                }
            }
            case ("up") -> {
                if (checkMovement(player,0 , -1)) {
                    player.setPosition(Position[0] - 1, Position[1]);

                }
            }

            case ("left") -> {
                if (checkMovement(player, 1,-1)) {
                    player.setPosition(Position[0], Position[1]  - 1);

                } }

            case ("right") -> {
                if (checkMovement(player,1,1)) {
                    player.setPosition(Position[0], Position[1]  + 1);


                }
            }



        }

    }
    public static boolean checkMovement(Wizard player, int rowOrColumn /* 0 are row and 1 are column*/, int direction){


       return  (player.getPosition()[rowOrColumn]+ direction <= MAP_SIZE-1 && player.getPosition()[rowOrColumn]+ direction >= 0);


    }

    public static void visuallyMovePlayer(Map map, Wizard wizard){
        System.out.println("                             ");
        map.printBoard(map);
        map.clearSquare(wizard.getPosition()[0], wizard.getPosition()[1]);
        String direction = getTextInput();
        movePlayer(wizard, map, direction);
        map.fillSquare(wizard.getPosition()[0], wizard.getPosition()[1], 1);
    }

    public static void visuallyMove(Map map, Wizard wizard, String command){
        System.out.println("                             ");
        map.printBoard(map);
        map.clearSquare(wizard.getPosition()[0], wizard.getPosition()[1]);

        movePlayer(wizard, map, command);
        map.fillSquare(wizard.getPosition()[0], wizard.getPosition()[1], 1);
    }

}
