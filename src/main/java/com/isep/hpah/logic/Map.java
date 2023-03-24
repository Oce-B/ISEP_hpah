package com.isep.hpah.logic;

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

    public boolean fillSquare(int row, int column, int color) {
        if (map[row][column] != 0) {
            return false;
        } else {
            map[row][column] = color;
            return true;
        }
    }
    public static int getSquare(int row, int column) {
        return map[row][column];
    }
}
