package com.isep.hpah.Game;

import com.isep.hpah.core.Core;
import com.isep.hpah.core.SortingHat;
import com.isep.hpah.core.Wand;
import com.isep.hpah.core.Wizard;
import  com.isep.hpah.core.logic.GameLogic;

import java.util.Random;
import java.util.Scanner;

import static com.isep.hpah.core.logic.GameLogic.*;

public class Game {

private Book book;
    public Game() {
         this.book = new Book();
        this.book.setCurrentBook(1);
        isGameOver = false;
    }




        public String setWizardName()
        {
            boolean nameSet=false;
            String name ;
            do {
                System.out.print("Choose your wizard's name!");
                name = getTextInput();
                System.out.println("Your name is " + name + " Is that correct?");
                System.out.println("1: Yes.");
                System.out.print("2: No, I wish to change my name.");


               if (readInt("--->",  2)==1){
                   nameSet=true;
                   return name;

               }
            }while (nameSet==false);
            System.out.println("oooo");
            return "";

        }




            public Wizard startGame() {
                Random rand= new Random();
            Wizard player = new Wizard(setWizardName(), 100, 100, 100, 50, 50, 1, 1, 1);

            SortingHat sortingHat = new SortingHat();
            sortingHat.chooseHouse(player);
            System.out.println("Welcome to House " + player.getHouse().getHouseName() + " , " + player.getCharacterName() + " !");
            player.setPosition(4, 2);

            Wand wand = new Wand();
           /* Core core;
            wand.setCore(core);*/
            wand.setSize(rand.nextInt(10,33));

            player.setWand(wand);
            return player;

            //Book.book1();
        }


    /*public String gameLoop() {

        while (!this.isGameOver) {
        }

        startGame();
        for(int i = 1; i == 7; i++){
            this.book.book+"i"();
        }


        return "";
    }*/
}
