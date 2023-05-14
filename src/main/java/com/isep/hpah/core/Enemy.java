package com.isep.hpah.core;

import java.util.Random;

public class Enemy extends AbstractEnemy{


    public Enemy(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense, int level) {
        super(characterName, healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense, level);

    }

    @Override
    public String attack(Character target, Spell spellUsed) {
        return null;
    }

    public String attack(Character target){

        String attackMessage ="Placeholder or something :/";
        int targetHp= target.getHealthPoints();

            int damage = (this.getAttackPoints()-target.getDefense());

            //Inspired by Pokemon attack formula
            // TODO find a better formula for damage
            // double damage= (((2*this.getLevel()/5+2)*this.getAttackPoints()* spellUsed.getSpellLevel())/target.getDefense()/50+2)/255 ;
            targetHp -= damage;

            attackMessage = this.getCharacterName() + " dealt " + damage +" points of damage to " + target.getCharacterName() + "!";
            target.setHealthPoints(targetHp);



        return attackMessage;
    };

}
