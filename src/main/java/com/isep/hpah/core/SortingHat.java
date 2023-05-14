package com.isep.hpah.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortingHat {

    List<House> houses = new ArrayList<>();


    public SortingHat() {
        houses.add(new House("Griffindor", 1.5, 1, 1, 1));
        houses.add(new House("Hufflepuff", 1, 1, 1.5, 1));
        houses.add( new House("Slytherin", 1, 1.5, 1, 1));
        houses.add( new House("Ravenclaw", 1, 1, 1, 1.25));
    }


    public void chooseHouse(Wizard wizard ){
        Random rand = new Random();

        House givenHouse = houses.get(rand.nextInt(houses.size()));
        wizard.setHouse(givenHouse);
    }
}


