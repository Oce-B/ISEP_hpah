package org.example;

import java.util.List;
import java.util.Scanner;

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

            //TODO: loop in case of a an invalid command


            System.out.println(wizard.getCharacterName()+  " 's turn!");

            displayCombatInfo();

            test:
            while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose your action!: ");
            String command = scanner.nextLine();

            switch (command) {
                case "act":
                    wizard.act();
                    System.out.println("----------------------------------------------");
                    System.out.println(wizard.getCharacterName()+" tried to do something.....");
                    System.out.println("But nothing happened!");
                    System.out.println("----------------------------------------------");
                   break test;
                case "spell":
                    displaySpells();
                    System.out.print("Enter spell index: ");
                    int spellIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Spell spell = wizard.getKnownSpells().get(spellIndex);

                    System.out.println(wizard.attack(enemies.get(0), spell));
                    System.out.println("----------------------------------------------");
                    break test;
                case "item":
                    // implement item usage logic here
                    System.out.println("Try again next time!");
                    System.out.println("----------------------------------------------");
                    break test;
                case "run":
                    // implement run logic here
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

        private void displaySpells() {
            List<Spell> spells = wizard.getKnownSpells();
            for (int i = 0; i < spells.size(); i++) {
                Spell spell = spells.get(i);
                System.out.println(i + ": " + spell.getSpellName() + " (" + spell.getManaCost() + " MP)");
            }
        }
    }

