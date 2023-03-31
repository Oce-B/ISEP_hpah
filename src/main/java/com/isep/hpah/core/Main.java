package com.isep.hpah.core;
import com.isep.hpah.Game.Game;
import com.isep.hpah.core.Map.Map;
import com.isep.hpah.gameMecanics.Battle;

import java.util.ArrayList;
import java.util.List;

import static com.isep.hpah.core.Map.Movement.movePlayer;
import static com.isep.hpah.core.Map.Movement.visuallyMovePlayer;
import static com.isep.hpah.core.logic.GameLogic.gameLoop;
import static com.isep.hpah.core.logic.GameLogic.getTextInput;

public class Main {
    public static void main(String[] args) {

        Map map = new Map();
        map.printBoard(map);
        map.fillSquare(0,2,-1);
        System.out.println("                           ");

        map.printBoard(map);

        Game game = new Game();
        Wizard wizard = game.startGame();

        map.fillSquare(wizard.getPosition()[0], wizard.getPosition()[1], 1);
       map.printBoard(map);


    while (true) {
        gameLoop(wizard, map);

    }

       /*Enemy badGuy = new Enemy("BadGuy",5,50,5,50,5,5);
        System.out.println("oh no, it's "+ badGuy.getCharacterName()+" !");
        List<Enemy> badGuys = new ArrayList<>();
        badGuys.add(badGuy);

        Battle battle = new Battle(wizard, badGuys);
        battle.start();*/



        }


    }

