package com.isep.hpah.core.Map;

public class Map {

    private static int[][] map;



    public static final int MAP_SIZE = 5;



    public Map() {
        this.map = new int[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                this.map[i][j] = 0;
            }
        }
    }

    public void printBoard(Map board){
        for (int i = 0; i < Map.MAP_SIZE; i++) {
            for (int j = 0; j < Map.MAP_SIZE; j++) {
                int squareColor = board.getSquare(i, j);
                if(squareColor == 0){
                    System.out.print("| ");
                } else {
                    System.out.printf("|%s", Symbol.getSymbol(squareColor).symbol);
                }
            }
            System.out.println("|");
        }
    }
    public boolean fillSquare(int row, int column, int color) {
        if (map[row][column] != 0) {
            return false;
        } else {
            map[row][column] = color;
            return true;
        }
    }

    public boolean clearSquare(int row, int column) {
        if (map[row][column] == 0) {
            return true;
        } else {
            map[row][column] = 0;
            return false;
        }
    }





    public static int getSquare(int row, int column) {
        return map[row][column];
    }


}
