package com.isep.hpah.Game;

import com.isep.hpah.core.logic.GameLogic;

import com.isep.hpah.core.Boss;
import com.isep.hpah.core.Enemy;

import java.util.List;

public class Book {

    private int currentBook;
    private String bookTitle;
    public String[] encounters = {"Battle", "Battle", "Nothing", "Nothing", "Inn", "Shop"} ;
    public Enemy[] enemies;
    public Boss[] bosses;


    public void nextBook(Game game) {
        currentBook++;
        if (currentBook > 7) {

        }
    }

   /* public void firstBook(){

    enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
    bosses = {new Boss("Troll")};
    bookTitle = "The Philosopher's Stone";
    }

    public void secondBook(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Basilic")};
        bookTitle = "The Chamber Of Secrets";

    }

    public void thirdBook(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Troll")};
        bookTitle = "The Prisonner of Azkaban";

    }
    public void fourthBook(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Voldemort"), new Boss("Pter Pettigrow")};
        bookTitle = "The Goblet of Fire";
    }
    public void fifthBook(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Dolores Ombrage")};
        bookTitle = "The Order of the Phenix";
    }

    public void sixthBook(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Troll")};
        bookTitle = "The Half-Blood Prince";
    }


    public void finalBook(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Voldemort"), new Boss("Bellatrix Lestrange")};
        bookTitle = "The Deathly Hallows";
    }


*/










    public void setCurrentBook(int currentBook) {
        this.currentBook = currentBook;
    }
}
