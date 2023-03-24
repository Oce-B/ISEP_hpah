package com.isep.hpah.core;
import com.isep.hpah.logic.Display;
import com.isep.hpah.logic.Experience;
import com.isep.hpah.logic.Battle;
import com.isep.hpah.Game.GameLogic;
import com.isep.hpah.logic.Map;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Map map= new Map();
        Display disp= new Display() ;

        GameLogic game= new GameLogic();

       Wizard player= game.startGame();



        disp.printMap(map);



    }




}