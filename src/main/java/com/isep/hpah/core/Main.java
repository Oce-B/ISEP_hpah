package com.isep.hpah.core;
import com.isep.hpah.Game.Game;
import com.isep.hpah.logic.Experience;
import com.isep.hpah.logic.Battle;
import com.isep.hpah.logic.GameLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameLogic game = new GameLogic();
        game.startGame();

      /*  Enemy badGuy = new Enemy("BadGuy",5,50,5,50,5,5);
        System.out.println("oh no, it's "+ badGuy.getCharacterName()+" !");
        List<Enemy> badGuys = new ArrayList<>();
        badGuys.add(badGuy);


        Spell punching = new Spell();
        punching.setSpellName("punching");
        punching.setSpellLevel(2);
        List<Spell> spellList = new ArrayList<>();
        spellList.add(punching);
        player.setKnownSpells(spellList);

        Battle battle = new Battle(player, badGuys );
        battle.start();

        Experience.levelUp(player);*/

    }




}