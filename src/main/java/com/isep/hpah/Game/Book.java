package com.isep.hpah.Game;

import com.isep.hpah.core.logic.GameLogic;

import com.isep.hpah.core.Boss;
import com.isep.hpah.core.Enemy;

import java.util.List;

public class Book {

    private int currentBook;
    private String bookTitle;
    final public String[] encounters = {"Battle", "Boss", "Shop", "Pet"} ;
    public Enemy[] enemies;
    public Boss[] bosses;


    public void nextBook(Game game) {
        currentBook++;
        if (currentBook > 7) {

        }
    }


   public void defineEncounters(String encounter){
        int book = this.getCurrentBook();
        switch (encounter){
            case "Battle":
                break;

            case "Inn":
                break;

            case "Boss":
                break;

            case "Shop":
                break;

            case "Nothing":
                break;
        }
   }

/*
   public void book1(){

    enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
    bosses = {new Boss("Troll")};
    bookTitle = "The Philosopher's Stone";
    Spell Leviosa = new Spell();
    }

    public void book2(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Basilic")};
        bookTitle = "The Chamber Of Secrets";

    }

    public void book3(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Troll")};
        bookTitle = "The Prisonner of Azkaban";

    }
    public void book4(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Voldemort"), new Boss("Peter Pettigrow")};
        bookTitle = "The Goblet of Fire";
    }
    public void book5(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Dolores Ombrage")};
        bookTitle = "The Order of the Phenix";
    }

    public void book6(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Troll")};
        bookTitle = "The Half-Blood Prince";
    }


    public void book7(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Voldemort"), new Boss("Bellatrix Lestrange")};
        bookTitle = "The Deathly Hallows";
    }


*/


    public int getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(int currentBook) {
        this.currentBook = currentBook;
    }
}
