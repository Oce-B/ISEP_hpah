package com.isep.hpah.core;

import java.util.List;

public class Spell extends AbstractSpell{


    private String spellName;

   private Wizard wizard;

    private int manaCost;
    public Spell(String spellName, int manaCost, String spellDescription){
        this.manaCost=manaCost;
        this.spellName=spellName;

    }


    @Override
    public String getSpellName() {
        return spellName;
    }

    @Override
    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }



}



