package com.isep.hpah.core.logic;

import com.isep.hpah.Game.Book;
import com.isep.hpah.core.Boss;
import com.isep.hpah.core.Enemy;
import com.isep.hpah.core.Wizard;

import java.util.Scanner;

import static com.isep.hpah.core.Map.Movement.movePlayer;

public class GameLogic {

    public static boolean isGameOver;
    static Scanner scanner = new Scanner(System.in);
    static boolean isRunning=true;
    public Wizard player;


    public Enemy[] enemies;
    public Boss[] bosses;

//Come on,  be serious
   /* public void randomEncounters(){
        int encounter = (int) (Math.random()* encounters.length);
    }*/

    public static String getTextInput() {
        String input;
        input = scanner.next();
        return input;
    }

    public static int nextInt(){
        return scanner.nextInt();
    }
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    public void fullHp(Wizard player){
        player.setHealthPoints(player.getMaxHealthPoints());
    }

    public static void characterInfo(){


    }
    public static void printMenu(){
        System.out.println("Choose an action");
        System.out.println("1: Continue your studies");
        System.out.println("2: Character info");
        System.out.println("3: Exit Game");
    }

    static void anythingToContinue(){
        System.out.println("Enter anything to continue");
         scanner.next();
    }
    public static void gameLoop() {
        while (isRunning) {
           // movePlayer(, map, scanner.next());
            if (scanner.next().equals("menu")) {
                printMenu();
                int input = readInt("->", 3);
                if (input == 1) {
                    // continueJourney();
                } else if (input == 2) {
                    characterInfo();
                } else {
                    isRunning = false;
                    System.out.println("ok");
                }
            }
        }
    }

}

