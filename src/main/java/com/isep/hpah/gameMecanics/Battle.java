package com.isep.hpah.gameMecanics;

import com.isep.hpah.Game.Game;
import com.isep.hpah.core.*;
import com.isep.hpah.core.Character;

import java.util.List;
import java.util.Scanner;

import static com.isep.hpah.core.logic.GameLogic.*;

public class Battle {
    //Inspired by a ChatGPT prompt
        private Wizard wizard;
        private List<AbstractEnemy> enemies;
        private boolean wizardTurn;

        public Game game;

        int actCount=0;

        public static boolean isBossFight= false;

        public Battle(Game game, Wizard wizard, List<AbstractEnemy> enemies) {
            this.game =game;
            this.wizard = wizard;
            this.enemies = enemies;
            this.wizardTurn = true;

            for(int i=0;i<enemies.size();i++){

                if (enemies.get(i).getClass()== Boss.class){
                    isBossFight=true;
                }
            }
        }

        public void start() {
            System.out.println("Battle started!");

            while (!isCombatOver()) {
                if (wizardTurn) {
                    wizardTurn();
                } else {
                    enemyTurn();
                }
                wizardTurn = !wizardTurn;
            }

            System.out.println("Battle ended!");
        }

        private void wizardTurn() {

            //TODO (oceane): loop in case of a an invalid command


            System.out.println(wizard.getCharacterName()+  " 's turn!");

            displayCombatInfo();

            test:
            while (true){

            String command = getTextInput();

            switch (command) {
                case "act":
                    //act(wizard);
                   // TODO (oceane) add act (house specific actions....)
                   break test;
                case "spell":
                    wizard.displaySpells();

                    int spellIndex = readInt("Enter spell index: ", wizard.getKnownSpells().size()+1);

                    Spell spell = wizard.getKnownSpells().get(spellIndex);
/* TODO (oceane) Add a mean to choose a target */
                   // int target= 0;

                    int target = readInt("Choose a target", enemies.size()+1);

                    for (AbstractEnemy enemy : enemies) {
                        System.out.println(target + enemy.getCharacterName() );
                    }
                    System.out.println(wizard.attack(enemies.get(target), spell));

                    break test;

                case "potion":

                    if (wizard.getPotions().size() == 0){

                        System.out.println("You have no potions left!");
                    }
                    else {
                        displayList(wizard.getPotions());
                        int potionIndex = readInt("Restore health or mana? : ",2);
                        wizard.usePotion(potionIndex);

                    }
                    break test;
                    //Running is useless.
            /*    case "run":
                    // run logic
                    System.out.println("");
                    System.out.println("----------------------------------------------");
                    break test;*/
                // wont exist in real game
                default:
                    System.out.println("Invalid action!");
                    System.out.println("----------------------------------------------");
                    break;
            }}
        }

        private void enemyTurn() {
            System.out.println("Enemy's turn!");

            for (AbstractEnemy enemy : enemies) {
                enemy.attack(wizard);
            }
            System.out.println("The enemies struck you!");
        }

    private boolean isCombatOver() {
        if (wizard.isDead()) {
            System.out.println(wizard.getCharacterName() + " is defeated!");
            return true;
        } else if (isBossFight && enemies.isEmpty() && bossConditionsMet()) {
            System.out.println("Boss defeated!");
            System.out.println(wizard.getCharacterName() + " won the battle!");
            return true;
        } else if (!isBossFight && enemies.isEmpty()) {
            System.out.println("Enemies defeated!");
            System.out.println(wizard.getCharacterName() + " won the battle!");
            return true;
        } else {
            return false;
        }
    }

    private boolean bossConditionsMet() {
        // Implement the specific conditions for defeating the boss
        // Return true if the conditions are met, false otherwise
        return false;
    }

        private void displayCombatInfo() {
            System.out.println(wizard.getCharacterName() + " (Level " + wizard.getLevel() + ") " + wizard.getHealthPoints() + "/" + wizard.getMaxHealthPoints() + " HP " + wizard.getManaPoints() + "/" + wizard.getMaxManaPoints() + " MP");
            System.out.println("vs.");
            for (AbstractEnemy enemy : enemies) {
                System.out.println(enemy.getCharacterName() + " (Level " + enemy.getLevel() + ") " + enemy.getHealthPoints() + "/" + enemy.getMaxHealthPoints() + " HP");
            }
            if (wizard.getHealthPoints()<= wizard.getMaxHealthPoints()*0.1){
                System.out.println("Be careful! You're almost out of life!");
            }
        }



    public Wizard getWizard() {
        return wizard;
    }

    public List<AbstractEnemy> getEnemies() {
        return enemies;
    }


    //TODO (oceane) create act method
    public String act(Wizard wizard)
    {
        String actMessage="";
        if (isBossFight==false){
            actMessage= "This won't help you for now!";

        } else{

           // actMessage=this.game.getBook(game.getCurrentBook()).get
            this.actCount+=1;
        }
        return actMessage;
    }

}

