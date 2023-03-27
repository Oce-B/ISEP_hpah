package com.isep.hpah.core.Map;

import java.util.InputMismatchException;

public enum Symbol {

    BOSS("B"),
    PLAYER("x");
    public final String symbol;
    Symbol(String symbol) {
        this.symbol = symbol;
    }
    public static Symbol getSymbol(int color){
        switch(color){
            case -1:
                return Symbol.BOSS;
            case 1:
                return Symbol.PLAYER;
        }
        throw new InputMismatchException();
}}
