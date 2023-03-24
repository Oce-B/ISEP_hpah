package com.isep.hpah.logic;

import com.isep.hpah.core.Wizard;

public class Display {

    public void printMap(Map map){
        for (int i = 0; i < Map.MAP_SIZE; i++) {
            for (int j = 0; j < Map.MAP_SIZE; j++) {
                int squareColor = Map.getSquare(i, j);
                if(squareColor == 0){
                    System.out.print("| ");
                } else {
                    System.out.printf("|%s");
                }
            }
            System.out.println("|");
        }
    }
    public void printText(String text) {
        System.out.println(text);
    }

}
