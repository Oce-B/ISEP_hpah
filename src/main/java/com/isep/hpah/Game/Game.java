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
            String name = setWizardName();
            Wizard player = new Wizard(name, 100, 100, 100, 50, 50, 1, 1, 1);
                System.out.println("g");
            SortingHat sortingHat = new SortingHat();
            sortingHat.chooseHouse(player);
            System.out.println("Welcome to House " + player.getHouse().getHouseName() + " , " + player.getCharacterName() + " !");
            player.setPosition(0, 0);
            return player;

            //Book.book1();
        }


   /* public String gameLoop() {

        while (!this.isGameOver) {
        }

        //return endMessage;

        return "";
    }*/
}
