package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Wizard player = new Wizard("",0,1000,1,50,1,1,1,1);
        System.out.println( "hi "+ player.getCharacterName() + " !");


        Enemy badGuy = new Enemy("BadGuy",5,5,5,50,5,5);
        System.out.println("oh no, it's "+ badGuy.getCharacterName()+" !");
        List<Enemy> badGuys = new ArrayList<>();
        badGuys.add(badGuy);


        Spell punching = new Spell();
        punching.setSpellName("punching");
        List<Spell> spellList = new ArrayList<>();
        spellList.add(punching);
        player.setKnownSpells(spellList);

        Battle battle = new Battle(player, badGuys );
        battle.start();

    }




}