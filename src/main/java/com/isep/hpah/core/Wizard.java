package com.isep.hpah.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.round;

public class Wizard extends Character{

    private int[] position = new int[2];
    private int experience;

    private Pet pet;

    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, double accuracy, int attackPoints, int defense, int level, int experience) {
        super(characterName , healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense);


        this.knownSpells= new ArrayList<>();
        this.learnNewSpell(new Spell("Wingardium Leviosa", 20, "It makes objects float and fall!"));
        this.setLevel(1);
        this.experience=0;
    }


@Override
    public String attack(Character target, Spell spellUsed){
       // its wasnt working so i asked chatgpt for another solution int luck= new Random().ints(0,100).findFirst().getAsInt();


        String attackMessage ="Placeholder or something :/";
        int targetHp= target.getHealthPoints();
 //I asked chatgpt for the random part
        Random random = new Random();
        int randomNumber = random.nextInt(101) ;


        if ( randomNumber <= this.getAccuracy() * 100* getHouse().getAccuracyBonus()) {
          // double damage = (this.getAttackPoints()-target.getDefense())*0.05;

                //Inspired by Pokemon attack formula
            //I changed it bc some mecanics werent in my game (STAB...)
          int damage= (int) (((2*this.getLevel()*20)*this.getAttackPoints()/target.getDefense()/5+2)* getHouse().getAttackBonus());
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
            System.out.println(spell.getSpellDescription());
        }
    }


    public void usePotion( int healthOrMana){
        //0 for health, 1 for mana


        if(healthOrMana ==0) {
            this.setHealthPoints((int) Math.round(this.getMaxHealthPoints() * 0.15 * this.getHouse().getPotionBonus()));
            System.out.println("Heath restored!");
        }else{
        this.setManaPoints((int) Math.round(this.getMaxManaPoints()*0.15*this.getHouse().getPotionBonus()));
            System.out.println("Mana restored!");
        }

        List<Potion> newList= (List<Potion>) this.getPotions().remove(0);
        this.setPotions(newList);
    }


    public void callPet(){}


    public void learnNewSpell(Spell newSpell){
        List<Spell> newSpellList = this.getKnownSpells();
      //  List<Spell> newSpellList = new ArrayList<>();

     newSpellList.add(newSpell);

        setKnownSpells(newSpellList);

    }
    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public void setKnownSpells(List<Spell> knownSpells) {
        this.knownSpells = knownSpells;
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

    public void setKnownSpells() {
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