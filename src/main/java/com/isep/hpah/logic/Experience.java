package com.isep.hpah.logic;

import com.isep.hpah.core.Spell;
import com.isep.hpah.core.Wizard;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Experience {

    int experienceToNextLevel ; //+= experienceToNextLevel*0.1;
    public static void levelUp(Wizard wizard){
        Scanner scanner = new Scanner(System.in);
        if (wizard.getLevel()<100){
            wizard.setLevel(wizard.getLevel()+1);
            wizard.setExperience(0);
            System.out.println("-------------------------");
            System.out.println(wizard.getCharacterName()+" has leveled up! They're now at level "+ wizard.getLevel() );

            System.out.println();

            displaySkills(wizard);
            System.out.print("Please choose a skill to improve");
            int skillIndex = scanner.nextInt();
           switch (skillIndex){
               case (0): //HealthPoints
                   System.out.println("HP UP!");

                   int newHp= wizard.getMaxHealthPoints() + 15 ;

                   wizard.setMaxHealthPoints(newHp);
                   System.out.println(wizard.getMaxHealthPoints());
                   break;

               case (1):
                   System.out.println("MANA UP!");
                   int newMana= wizard.getMaxManaPoints() + 15 ;
                   wizard.setMaxManaPoints(newMana);

                   System.out.println(wizard.getMaxManaPoints());
                    break;

               case(2):
                   System.out.println("Attack  UP!");


                   break;

               case(3):
                   System.out.println("Defense UP!");

                   break;


           }

       //TODO Allow user to improve skills (make sure to use House related bonusses)

            System.out.println("-------------------------");
        }

        else {
            System.out.println(wizard.getCharacterName() + " has reached the highest level! Congratulations!");
            wizard.setExperience(0);
        }
    }




        public static void battleRewards(Battle battle){

        }


    private static void displaySkills(Wizard wizard) {
       // List <String> skills =["Max Health Points", "Max Mana Points", "Attack Points", "Defense"];
        List<String> skills = Arrays.asList("Max Health Points", "Max Mana Points", "Attack Points", "Defense");

        //List<Spell> spells = wizard.getKnownSpells();
        for (int i = 0; i < skills.size(); i++) {
            String skill = skills.get(i);
            System.out.println(i + ": " + skill);
        }
    }
}
