package org.example;

public abstract class Character {

    private String name;
    private int healthPoints;
    private int maxHealthPoints;

    private int maxManaPoints;
    private int manaPoints;
    private double accuracy;
    public abstract void attack(Character);
}
