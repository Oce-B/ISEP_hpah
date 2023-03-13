package org.example;

public class Spell extends AbstractSpell{


   private int spellLevel;

    private String spellName;
    private int manaCost;
    public Spell(){
        this.spellLevel=1;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public String getSpellName() {
        return spellName;
    }
}
