package com.isep.hpah.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortingHat {

    List<House> houses = new ArrayList<>();


    public SortingHat() {
        houses.add(new House("Griffindor", 2, 1, 1, 1));
        houses.add(new House("Hufflepuff", 1, 1, 2, 1));
        houses.add( new House("Slytherin", 1, 2, 1, 1));
        houses.add( new House("Ravenclaw", 1, 1, 1, 2));
    }


    public void chooseHouse(Wizard wizard ){
        Random rand = new Random();

        House test = houses.get(rand.nextInt(houses.size()));
        System.out.println(test.getHouseName());
        wizard.setHouse(test);
    }
}

