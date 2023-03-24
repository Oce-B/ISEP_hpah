package com.isep.hpah.Game;

import com.isep.hpah.core.SortingHat;
import com.isep.hpah.core.Wizard;

import java.util.Scanner;

public class GameLogic {
    private int currentStage;
    public static boolean isGameOver;

    public GameLogic() {
        currentStage = 1;
        isGameOver = false;
    }

    public Wizard startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your wizard's name!");
        Wizard player = new Wizard("",100,100,100,50,50,1,1,1);

        SortingHat sortingHat= new SortingHat();
        sortingHat.chooseHouse(player);
        System.out.println("Welcome to House "+player.getHouse().getHouseName()+" , "+player.getCharacterName()+" !");
        return player;
    }

    public static void gameloop() {

        while (!isGameOver) {
        }
    }

    public static void playerInfo(Character character){


    }
    public void nextStage() {
        currentStage++;
        if (currentStage > 7) {
            isGameOver = true;
        }
    }



    public void GameOver(){

        }


}