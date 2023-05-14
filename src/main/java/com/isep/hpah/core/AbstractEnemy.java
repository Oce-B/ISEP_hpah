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
}

