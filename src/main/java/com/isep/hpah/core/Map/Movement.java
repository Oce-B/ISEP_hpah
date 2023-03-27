package com.isep.hpah.core.Map;


import com.isep.hpah.core.Wizard;

import static com.isep.hpah.core.Map.Map.MAP_SIZE;

public class Movement {
    private Map map;

    private void movePlayer(Wizard player, Map map, String direction){

        int[] Position = {player.getPosition()[0], player.getPosition()[1]};

        switch (direction) {
            case ("z") -> {
                if (checkMovement(player,0,1)) {
                    player.setPosition(Position[0] + 1, Position[1]);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");
                }
            }
            case ("s") -> {
                if (checkMovement(player,0 , -1)) {
                    player.setPosition(Position[0] - 1, Position[1]);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");

                }
            }

            case ("q") -> {
                if (checkMovement(player, 1,-1)) {
                    player.setPosition(Position[0], Position[1]  - 1);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");

                }
            }

            case ("d") -> {
                if (checkMovement(player,0,1)) {
                    player.setPosition(Position[0], Position[1]  + 1);
                    System.out.println("ok");
                } else {
                    System.out.println("impossible movement");

                }
            }

        }

    }
    private boolean checkMovement(Wizard player, int rowOrColumn /* 0 are row and 1 are column*/, int direction){
        boolean movementPossible;
        int max = MAP_SIZE;

       return  (player.getPosition()[rowOrColumn]+ direction <= MAP_SIZE && player.getPosition()[rowOrColumn]+ direction >= - MAP_SIZE);


    }


}
