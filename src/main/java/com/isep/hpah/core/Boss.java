package com.isep.hpah.core;

public class Boss extends AbstractEnemy{

    public Boss(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense) {
        super(characterName, healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense);
    }

    @Override
    public String attack(Character target, Spell spellUsed) {
        return null;
    }
}
