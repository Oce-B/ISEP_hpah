package com.isep.hpah.Game;

import com.isep.hpah.core.SortingHat;
import com.isep.hpah.core.Wizard;
import  com.isep.hpah.core.logic.GameLogic;

import java.util.Scanner;

import static com.isep.hpah.core.logic.GameLogic.*;

public class Game {



    public Game() {
        Book book = new Book();
        book.setCurrentBook(1);
        isGameOver = false;
    }

    public Wizard startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean nameSet;
        String Name;
        do {
            nameSet = false;
            System.out.println("Choose your wizard's name!");
            Name = getTextInput();
            System.out.println("Your name is " + Name + " Is that correct?");
            System.out.println("1: Yes!");
            System.out.println("2: No that is not correct.");
            int input = readInt(" -> ", 2);
            if (input == 1) {
                nameSet = true;
            }

        } while (!nameSet);

       // Book.printIntro();
        Wizard player = new Wizard(Name, 100, 100, 100, 50, 50, 1, 1, 1);

        SortingHat sortingHat = new SortingHat();
        sortingHat.chooseHouse(player);
        System.out.println("Welcome to House " + player.getHouse().getHouseName() + " , " + player.getCharacterName() + " !");
       player.setPosition(0,0);
        return player;
    }


   /* public String gameLoop() {

        while (!this.isGameOver) {
        }

        //return endMessage;

        return "";
    }*/
}
