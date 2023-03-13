package com.isep.hpah.core;

public abstract class Character {

    private int level;
    private String characterName;
    private int healthPoints;
    private int maxHealthPoints;
    private int maxManaPoints;
    private int manaPoints;
    private double accuracy;
    private int attackPoints;
    private int defense;

    public Character(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense){
        this.characterName=characterName;
        this.healthPoints=healthPoints;
        this.maxHealthPoints=maxHealthPoints;
        this.maxManaPoints=manaPoints;
        this.manaPoints=manaPoints;
        this.accuracy=accuracy;
        this.attackPoints=attackPoints;
        this.defense=defense;


}
    public abstract String attack(Character target, Spell spellUsed);

    public boolean isDead(){
        return (this.healthPoints <= 0);
    }


//Setters and getters


    public int getAttackPoints() {
        return attackPoints;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setCharacterName(String characterName){
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

//TODO make sure that maxHealthPoints is always superior to healthPoints
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
