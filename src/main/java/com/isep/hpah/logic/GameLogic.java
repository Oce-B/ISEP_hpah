package com.isep.hpah.logic;

import com.isep.hpah.core.SortingHat;
import com.isep.hpah.core.Wizard;

import java.util.Scanner;

public class GameLogic {
    private int currentStage;
    private boolean gameOver;

    public GameLogic() {
        currentStage = 1;
        gameOver = false;
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your wizard's name!");
        Wizard player = new Wizard("",100,100,100,75,50,1,1,1);

        SortingHat sortingHat= new SortingHat();
        sortingHat.chooseHouse(player);
        System.out.print("Welcome to House "+player.getHouse().getHouseName()+" , "+player.getCharacterName()+" !");



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