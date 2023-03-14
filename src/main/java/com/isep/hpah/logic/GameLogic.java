package com.isep.hpah.logic;

public class GameLogic {
    private int currentStage;
    private boolean gameOver;

    public GameLogic() {
        currentStage = 1;
        gameOver = false;
    }

    public void nextStage() {
        currentStage++;
        if (currentStage > 7) {
            gameOver = true;
        }
    }


    public boolean isGameOver() {

        return gameOver;
    }

    public void GameOver(){

        }


}