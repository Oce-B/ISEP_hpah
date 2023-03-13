package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

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
        System.out.println("accuracy = "+this.getAccuracy());

        String attackMessage ="Placeholder or something :/";
        int targetHp= target.getHealthPoints();

                //Inspired by Pokemon attack formula
        if (this.getAccuracy()*100 >= luck) {
            targetHp-=targetHp;
           // targetHp -= (((2*this.getLevel()/5+2)*this.getAttackPoints()* spellUsed.getSpellLevel())/target.getDefense()/50+2)/255 ;
             attackMessage = this.getCharacterName() + " dealt " + " damage to " + target.getCharacterName() + "!";

        } else if (this.getAccuracy()*100 < luck) {
           attackMessage = this.getCharacterName()+ " has missed!! Haha you idiot :3";

        }

        return attackMessage;
    };

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




}