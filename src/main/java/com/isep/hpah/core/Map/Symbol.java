package com.isep.hpah.core.Map;

import java.util.InputMismatchException;

public enum Symbol {

    BOSS("B"),
    PLAYER("x"),
    COMBAT("c"),
    SHOP("s"),
    PET("P"),
    INN("I");


    public final String symbol;
    Symbol(String symbol) {
        this.symbol = symbol;
    }
    public static Symbol getSymbol(int color){
        switch(color){
            case 6:
                return Symbol.BOSS;
            case 1:
                return Symbol.PLAYER;

            case 2:
                return Symbol.COMBAT;

            case 3:
                return Symbol.SHOP;

            case 4:
                return Symbol.PET;


            case 5:
                return Symbol.INN;


        }
        throw new InputMismatchException();
}}
