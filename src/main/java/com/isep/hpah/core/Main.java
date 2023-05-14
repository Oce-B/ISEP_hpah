package com.isep.hpah.core;
import com.isep.hpah.Game.Game;
import com.isep.hpah.core.Map.Map;

import java.util.ArrayList;
import java.util.List;

import static com.isep.hpah.core.logic.GameLogic.*;

public class Main {
    public static void main(String[] args) {

        Map map = new Map();


        Game game = new Game(map);
        Wizard wizard = game.startGame();
        System.out.println(wizard.getKnownSpells().get(0).getSpellName());
      wizard.getKnownSpells().add(game.getBook(game.currentBook).getSpells().get(0));


        while (true) {
            gameLoop(wizard, map, game);


        }


      /*  Battle battle = new Battle(wizard, badGuys);
        battle.start();*/






        /*int[][] test= new int[2][2];
      test[1] = [2,5];
        int c = test[1][0] = 50;
        int d = test[1][0] = 50;

        System.out.println(a + "   "+ c+d);

*/



        }


    }

