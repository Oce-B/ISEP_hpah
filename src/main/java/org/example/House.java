package org.example;

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

    House Griffindor = new House("Griffindor", 2, 1, 1, 1);
    House Hufflepuff = new House("Hufflepuff", 1, 1, 2, 1);
    House Slytherin = new House("Slytherin", 1, 2, 1, 1);
    House Ravenclaw = new House("Ravenclaw", 1, 1, 1, 2);
}

