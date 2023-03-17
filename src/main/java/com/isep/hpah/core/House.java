package com.isep.hpah.core;

public class House {
    private String houseName;
    private double defenseBonus;
    private double attackBonus;
    private double potionBonus;
    private double accuracyBonus;

    public House(String houseName, double defenseBonus, double attackBonus, double potionBonus, double accuracyBonus) {
        this.houseName = houseName;
        this.defenseBonus = defenseBonus;
        this.attackBonus = attackBonus;
        this.potionBonus = potionBonus;
        this.accuracyBonus = accuracyBonus;
    }

    public String getHouseName() {
        return houseName;
    }

    public double getAccuracyBonus() {
        return accuracyBonus;
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }

    public double getPotionBonus() {
        return potionBonus;
    }
}

