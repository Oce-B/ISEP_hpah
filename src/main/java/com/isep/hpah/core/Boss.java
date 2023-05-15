package com.isep.hpah.core;

public class Boss extends AbstractEnemy{
    private boolean defeatConditionMet;

    public Boss(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense, int level) {
        super(characterName, healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense, level);
        this.defeatConditionMet = false;
    }


    public void setDefeatConditionMet(boolean defeatConditionMet) {
        this.defeatConditionMet = defeatConditionMet;
    }

    public boolean isDefeatConditionMet() {
        return defeatConditionMet;
    }

    @Override
    public String attack(Character target, Spell spellUsed) {
        return null;
    }

    public boolean isDead() {
        return super.isDead() || defeatConditionMet;
    }
}
