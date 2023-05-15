package com.isep.hpah.core;

public abstract class AbstractEnemy extends Character {
    private int level;

    public AbstractEnemy(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense, int level) {
        super(characterName, healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense);

        this.level=level;
    }

    public void attack(){
        return;
    }

    public boolean isDead() {
        return this.getHealthPoints() <= 0;
    }

    public String attack(Wizard target){

        String attackMessage ="Placeholder or something :/";
        int targetHp= target.getHealthPoints();

        //int damage = (this.getAttackPoints()-target.getDefense());

        //Inspired by Pokemon attack formula
        // TODO find a better formula for damage
         int damage= (int) (((2*this.getLevel()/5+2)*this.getAttackPoints()/target.getDefense()*target.getHouse().getDefenseBonus()/5+2)/255) ;
        targetHp -= damage;

        attackMessage = this.getCharacterName() + " dealt " + damage +" points of damage to " + target.getCharacterName() + "!";
        target.setHealthPoints(targetHp);



        return attackMessage;
    };

}

