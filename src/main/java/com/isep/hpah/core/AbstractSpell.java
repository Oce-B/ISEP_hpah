package com.isep.hpah.core;

public abstract class AbstractSpell {

    private String spellName;
    private String spellDescription;
    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }
    public String getSpellName() {
        return spellName;
    }

    public void setSpellDescription(String spellDescription) {
        this.spellDescription = spellDescription;
    }

    public String getSpellDescription() {
        return spellDescription;
    }
}
