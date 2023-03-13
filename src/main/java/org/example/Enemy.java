package org.example;

import java.util.Random;

public class Enemy extends AbstractEnemy{
    public Enemy(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense) {
        super(characterName, healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense);
    }

    @Override
    public String attack(Character target, Spell spellUsed) {
        return null;
    }

    public String attack(Character target){
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

}
