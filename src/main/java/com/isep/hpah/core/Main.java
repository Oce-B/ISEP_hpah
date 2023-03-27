package com.isep.hpah.core;
import com.isep.hpah.Game.Game;
import com.isep.hpah.gameMecanics.Map;

import static com.isep.hpah.core.logic.GameLogic.gameLoop;

public class Main {
    public static void main(String[] args) {

 Map map = new Map();
 map.printBoard(map);
        map.fillSquare(0,2,1);
        System.out.println("                           ");
map.printBoard(map);

Game game= new Game();
Wizard wizard = game.startGame();
        map.fillSquare(wizard.position[0],wizard.position[1],1);
        map.printBoard(map);
gameLoop();
    }




}