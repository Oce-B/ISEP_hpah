package org.example;

public abstract class AbstractEnemy extends Character {

    public AbstractEnemy(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense) {
        super(characterName, healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense);
    }

    public void attack(){
        return;
    }
}

