package com.isep.hpah.core;
import com.isep.hpah.Game.Game;
import com.isep.hpah.core.Map.Map;

import static com.isep.hpah.core.Map.Movement.movePlayer;
import static com.isep.hpah.core.Map.Movement.visuallyMovePlayer;
import static com.isep.hpah.core.logic.GameLogic.gameLoop;
import static com.isep.hpah.core.logic.GameLogic.getTextInput;

public class Main {
    public static void main(String[] args) {

 Map map = new Map();
 /*map.printBoard(map);
        map.fillSquare(0,2,-1);
        System.out.println("                           ");
        */

map.printBoard(map);

Game game= new Game();
Wizard wizard = game.startGame();

        map.fillSquare(wizard.getPosition()[0],wizard.getPosition()[1],1);
        map.printBoard(map);
        while (true) {
            visuallyMovePlayer(map, wizard);
            /*System.out.println("                             ");
            map.clearSquare(wizard.getPosition()[0], wizard.getPosition()[1]);
            String direction = getTextInput();
            movePlayer(wizard, map, direction);
            map.fillSquare(wizard.getPosition()[0], wizard.getPosition()[1], 1);

            map.printBoard(map);
            System.out.println(wizard.getPosition()[0]);*/
        }
    }




}