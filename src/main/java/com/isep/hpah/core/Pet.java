package com.isep.hpah.core;

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
}
