package com.isep.hpah.Game;

import com.isep.hpah.core.*;
import com.isep.hpah.core.Map.Map;
import  com.isep.hpah.core.logic.GameLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static com.isep.hpah.core.logic.GameLogic.*;

public class Game {

private Enemy enemy;
private AbstractEnemy enemmies;
public int currentBook;
    List<Book> bookList = new ArrayList<>();
//private Book currentBook ;
//TODO change intros
    public Game(Map map) {

        this.bookList.add(new Book(map, "The philosopher's stone", /*TODO change intro*/"Your first year!", "You did it!",  new ArrayList<AbstractEnemy>() {{  add(new Enemy("Other Troll", 500, 500, 150, 50, 150, 200,5));
                add(new Enemy("Other Troll", 500, 500, 150, 50, 150, 200,5)); }},new ArrayList<Boss>() {{add(new Boss("Troll", 1500, 1500, 250, 60, 200, 300,10));}}, new ArrayList<int[]>(){{ add(new int[]{0, 1}); add(new int[]{1, 2}); add(new int[]{2, 3}); add(new int[]{3, 4});}} ,  new ArrayList<Spell>(){{ add(new Spell("Wingardium Leviosa", 20, "It makes objects float and fall!"));}}
        ));

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
            this.currentBook=0;
              this.getBook(0);

                isGameOver = false;
            Wizard player = new Wizard(setWizardName(), 200, 200, 100, 0.8, 100, 100, 1, 1);

            List<Potion> initialPotions = new ArrayList<>();
            initialPotions.add(new Potion("Your first potion!"));
            initialPotions.add(new Potion("Your second potion!"));
            player.setPotions(initialPotions);

            SortingHat sortingHat = new SortingHat();
            sortingHat.chooseHouse(player);

            System.out.println("Welcome to House " + player.getHouse().getHouseName() + " , " + player.getCharacterName() + " !");
            player.setPosition(4, 2);

            Wand wand = new Wand();
            wand.setCore( Core.getRandomCore());
            wand.setSize(rand.nextInt(10,33));


            //player.setPet(Pet.getNewPet(Pet.setPetName()));


            player.setWand(wand);


            return player;


        }

/*
    public String gameLoop() {

        while (!isGameOver) {
            startGame();
            book.book1();
        }


        return " ";
        }

*/

    public Book getBook(int number) {
        return this.bookList.get(number);
    }
}

