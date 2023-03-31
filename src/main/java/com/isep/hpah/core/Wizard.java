package com.isep.hpah.core;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wizard extends Character{

    private int[] position = new int[2];
    private int experience;

    private Pet pet;

    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense, int level, int experience) {
        super(characterName , healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense);



        this.experience=0;
    }


@Override
    public String attack(Character target, Spell spellUsed){
        int luck= new Random().ints(0,100).findFirst().getAsInt();
        System.out.println("luck = "+luck);
        System.out.println("accuracy= "+this.getAccuracy());

        String attackMessage ="Placeholder or something :/";
        int targetHp= target.getHealthPoints();

        if (this.getAccuracy()*100 < luck) {
           double damage = (this.getAttackPoints()-target.getDefense())*0.05;

                //Inspired by Pokemon attack formula
            // TODO (oceane) find a better formula for damage
         // double damage= (((2*this.getLevel()/5+2)*this.getAttackPoints()* spellUsed.getSpellLevel())/target.getDefense()/50+2)/255 ;
           targetHp -= damage;

             attackMessage = this.getCharacterName() + " dealt " + damage +" points of damage to " + target.getCharacterName() + "!";
            target.setHealthPoints(targetHp);
        } else  {
           attackMessage = this.getCharacterName()+ " has missed!!";

        }

        return attackMessage;
    };


    //TODO (oceane) create act method
    public String act()
    {return "";}



    public void displaySpells() {
        List<Spell> spells = this.getKnownSpells();
        for (int i = 0; i < spells.size(); i++) {
            Spell spell = spells.get(i);
            System.out.println(i + ": " + spell.getSpellName() + " (" + spell.getManaCost() + " MP)");
        }
    }


    public void usePotion(Potion potion){
        if (this.getHouse().getHouseName().equals("Hufflepuff")){

        } else {


        }
    }


    public void callPet(){}


    public String learnNewSpell(Spell newSpell){
        knownSpells.add(newSpell);
        return this.getCharacterName() + " has learned " + newSpell +" !";
    }
    public List<Spell> getKnownSpells() {
        return knownSpells;
    }



    public void defend(){
    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void setKnownSpells(List<Spell> knownSpells) {
        this.knownSpells = knownSpells;
    }
    public void setPosition( int row, int column) {
        int[] Position = {row, column};
        this.position = Position;
    }

    public int[] getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }
}