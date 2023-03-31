package com.isep.hpah.gameMecanics;

import com.isep.hpah.core.Character;
import com.isep.hpah.core.Enemy;
import com.isep.hpah.core.Spell;
import com.isep.hpah.core.Wizard;

import java.util.List;
import java.util.Scanner;

import static com.isep.hpah.core.logic.GameLogic.*;

public class Battle {
    //Inspired by a ChatGPT prompt
        private Wizard wizard;
        private List<Enemy> enemies;
        private boolean wizardTurn;

        public Battle(Wizard wizard, List<Enemy> enemies) {
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

                    int spellIndex = readInt("Enter spell index: ", wizard.getKnownSpells().size() );

                    Spell spell = wizard.getKnownSpells().get(spellIndex);
/* TODO (oceane) Add a mean to choose a target */
                    int target= 0;
                    System.out.println(wizard.attack(enemies.get(target), spell));

                    break test;

                case "potion":
                    displayList(wizard.getPotions());
                    int potionIndex = readInt("Enter potion index: ", wizard.getPotions().size() );
                    wizard.usePotion(wizard.getPotions().get(potionIndex));
                    break test;
                case "run":
                    // run logic
                    System.out.println("You can't run away from your spaghetti code!!!!");
                    System.out.println("----------------------------------------------");
                    break test;
                default:
                    System.out.println("Invalid action!");
                    System.out.println("----------------------------------------------");
                    break;
            }}
        }

        private void enemyTurn() {
            System.out.println("Enemy's turn!");

            for (Enemy enemy : enemies) {
                enemy.attack(wizard, new Spell());
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
            for (Enemy enemy : enemies) {
                System.out.println(enemy.getCharacterName() + " (Level " + enemy.getLevel() + ") " + enemy.getHealthPoints() + "/" + enemy.getMaxHealthPoints() + " HP");
            }
            if (wizard.getHealthPoints()<= wizard.getMaxHealthPoints()*0.1){
                System.out.println("Be careful! You're almost out of life!");
            }
        }



    public Wizard getWizard() {
        return wizard;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}

