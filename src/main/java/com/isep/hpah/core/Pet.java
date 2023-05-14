package com.isep.hpah.core;

import java.util.Random;

import static com.isep.hpah.core.logic.GameLogic.getTextInput;
import static com.isep.hpah.core.logic.GameLogic.readInt;

public enum Pet {

    OWL,
    RAT,
    CAT,
    TOAD;
    private String  petName;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet getNewPet(String petName) {
        Random random = new Random();
        this.petName=petName;
        return values()[random.nextInt(values().length)];

    }

    public String setPetName()
    {
        boolean nameSet=false;
        String name ;
        do {
            System.out.print("Choose your pet's name!");
            name = getTextInput();
            System.out.println("Your pet's name is " + name + " Is that correct?");
            System.out.println("1: Yes.");
            System.out.print("2: No, I wish to change their name.");


            if (readInt("--->",  2)==1){
                nameSet=true;
                return name;

            }
        }while (nameSet==false);
        System.out.println("oooo");
        return "";

    }

}
