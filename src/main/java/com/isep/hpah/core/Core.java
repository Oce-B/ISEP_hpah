package com.isep.hpah.core;

import java.util.Random;

public enum Core {
     PHOENIX_FEATHER,
     DRAGON_HEARTSTRING,

     UINCORN_HORN;

     public static Core getRandomCore() {
          Random random = new Random();
          return values()[random.nextInt(values().length)];
     }


}
