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
                case "attack":
                    wizard.attack(enemies.get(0), new Spell());
                    break test ;
                case "spell":
                    displaySpells();
                    System.out.print("Enter spell index: ");
                    int spellIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Spell spell = wizard.getKnownSpells().get(spellIndex);
                    wizard.attack(enemies.get(0), spell);
                    break test;
                case "item":
                    // implement item usage logic here
                    break test;
                case "run":
                    // implement run logic here
                    break test;
                default:
                    System.out.println("Invalid action!");
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
                System.out.println("is defeatec!");
                return true;
            } else if (enemies.isEmpty() || enemies.stream().allMatch(Character::isDead)) {
                System.out.println("Enemies defeated!");
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
        }

        private void displaySpells() {
            List<Spell> spells = wizard.getKnownSpells();
            for (int i = 0; i < spells.size(); i++) {
                Spell spell = spells.get(i);
                System.out.println(i + ": " + spell.getSpellName() + " (" + spell.getManaCost() + " MP)");
            }
        }
    }

