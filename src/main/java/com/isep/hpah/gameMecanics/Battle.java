package com.isep.hpah.gameMecanics;

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

        public Battle(Wizard wizard, List<AbstractEnemy> enemies) {
            this.wizard = wizard;
            this.enemies = enemies;
            this.wizardTurn = true;
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
                    wizard.act();
                   // TODO (oceane) add act (house specific actions....)
                   break test;
                case "spell":
                    wizard.displaySpells();

                    int spellIndex = readInt("Enter spell index: ", wizard.getKnownSpells().size());

                    Spell spell = wizard.getKnownSpells().get(spellIndex);
/* TODO (oceane) Add a mean to choose a target */
                    int target= 0;
                    System.out.println(wizard.attack(enemies.get(target), spell));

                    break test;

                case "potion":

                    if (wizard.getPotions().size() <= 0){

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
                enemy.attack(wizard,new Spell("Punch", 150,"They're trying..."));
            }
        }

        private boolean isCombatOver() {
            if (wizard.isDead()) {
                System.out.println(wizard.getCharacterName() + " is defeated!");
                boolean gameOver=true;
                return true;
            } else if (enemies.isEmpty() || enemies.stream().allMatch(Character::isDead)) {
                System.out.println("Enemies defeated!");
                System.out.println(wizard.getCharacterName()+" won the battle!");
                return true;
            } else {
                return false;
            }
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
}

