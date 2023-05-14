package com.isep.hpah.core.Map;

public class GameMap {

    private Map map;
  /*  private int[][] combatCases;

    private int[] innCase;


    private int[] petCase;
    private int[] bossFightCase;

    private int[] shopCase;



    */


    public GameMap(Map map, int[] combatCases, int[] innCase, int[] petCase, int[] shopCase){

        //Placing the boss
        map.fillSquare(0,2,6);



        //Placing the ennemies

            map.fillSquare(combatCases[0], combatCases[1], 2);



        //Placing the shop
        map.fillSquare(shopCase[0],shopCase[1],3);

        //Placing the pet
        map.fillSquare(petCase[0],petCase[1],4);

        //Placing the inn
        map.fillSquare(innCase[0],innCase[1],5);
    }

/*
    public void setBossFightCase(int[] bossFightCase) {
        this.bossFightCase = bossFightCase;
    }

    public int[] getBossFightCase() {
        return bossFightCase;
    }

    public void setCombatCase(int[] combatCase) {
        this.combatCase = combatCase;
    }

    public int[] getCombatCase() {
        return combatCase;
    }


    public int[] getInnCase() {
        return innCase;
    }

    public void setInnCase(int[] innCase) {
        this.innCase = innCase;
    }

    public int[] getPetCase() {
        return petCase;
    }

    public void setPetCase(int[] petCase) {
        this.petCase = petCase;
    }

    public void setShopCase(int[] shopCase) {
        this.shopCase = shopCase;
    }

    public int[] getShopCase() {
        return shopCase;
    }
*/
    public Map getMap() {
        return map;
    }
    public void setMap(Map map) {
        this.map = map;
    }

}
