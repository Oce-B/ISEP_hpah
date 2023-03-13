package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Wizard player = new Wizard("",1000,100,1,1,1,1,1,1);
        System.out.println( "hi "+ player.getCharacterName() + " !");


        Enemy badGuy = new Enemy("BadGuy",5,5,5,5,5,5);
        System.out.println("oh no, it's "+ badGuy.getCharacterName()+" !");


        Spell punching = new Spell();
        punching.setSpellName("punching");
        List<Spell> spellList = new ArrayList<>();
        spellList.add(punching);

        player.setKnownSpells(spellList);

    }




}