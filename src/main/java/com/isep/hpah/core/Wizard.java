package com.isep.hpah.core;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wizard extends Character{


    private int experience;

    private Pet pet;

    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense, int level, int experience) {
        super(characterName = "", healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your wizard's name!");
        this.setCharacterName(scanner.next());
        this.setLevel(1);
        this.experience=0;
    }


@Override
    public String attack(Character target, Spell spellUsed){
        int luck= new Random().ints(0,100).findFirst().getAsInt();
        System.out.println("luck = "+luck);
        System.out.println("accuracy= "+this.getAccuracy());

        String attackMessage ="Placeholder or something :/";
        int targetHp= target.getHealthPoints();

        if (this.getAccuracy()*100 >= luck) {
           double damage = (this.getAttackPoints()-target.getDefense())*0.05;

                //Inspired by Pokemon attack formula
            // TODO find a better formula for damage
         // double damage= (((2*this.getLevel()/5+2)*this.getAttackPoints()* spellUsed.getSpellLevel())/target.getDefense()/50+2)/255 ;
           targetHp -= damage;

             attackMessage = this.getCharacterName() + " dealt " + damage +" points of damage to " + target.getCharacterName() + "!";
            target.setHealthPoints(targetHp);
        } else if (this.getAccuracy()*100 < luck) {
           attackMessage = this.getCharacterName()+ " has missed!!";

        }

        return attackMessage;
    };


    //TODO create act method
    //This method is inspired by undertale. It allows the user to win the battle with a specific action taht doesnt involve using spells....
    public String act()
    {return "";}


    public String learnNewSpell(Spell newSpell){
        knownSpells.add(newSpell);
        return this.getCharacterName() + " has learned " + newSpell +" !";
    }
    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public void setKnownSpells(List<Spell> knownSpells) {
        this.knownSpells = knownSpells;
    }

    public void defend(){
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}