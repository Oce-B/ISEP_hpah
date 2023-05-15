package com.isep.hpah.Game;

import com.isep.hpah.core.AbstractEnemy;
import com.isep.hpah.core.Map.GameMap;
import com.isep.hpah.core.Spell;

import com.isep.hpah.core.Boss;
import com.isep.hpah.core.Map.Map;

import java.util.ArrayList;
import java.util.List;


public class Book {

    //Inspired by this tutorial: https://www.youtube.com/watch?v=X6jJAZFVDws&list=PLiuAYTl0L-gHgqyWtUKAAhtrTymOLHd28
    private int currentBook;
    private String bookTitle;
   // final private String[] encounters = {"Battle", "Boss", "Shop", "Inn", "Nothing"} ;
    private List<AbstractEnemy> enemies= new ArrayList<AbstractEnemy>();

    private List
   private List<Boss> boss = new ArrayList<>();
    private String bookIntroduction;
    private String bookConclusion;
    private List<int[]> casesPositions=new ArrayList<int[]>(4);
    private List<Spell> spells = new ArrayList<Spell>();

    private GameMap bookGameMap;

    private Map map;

public Book(Map map,String bookTitle, String bookIntroduction, String bookConclusion, List<AbstractEnemy> ennemies,List<Boss> boss,List<int[]> casesPositions, List<Spell> spells ){

    for (int i=0; i<ennemies.size(); i++ ){
        this.enemies.add(ennemies.get(i));

    }
    for (int i=0; i<spells.size(); i++ ){
        this.spells.add(spells.get(i));

    }

    for (int i=0; i<boss.size(); i++ ) {
        this.boss.add(boss.get(i));
    }

        for (int i=0; i<casesPositions.size(); i++ ){
        this.casesPositions.add(casesPositions.get(i));
        /* From 0 to 4:
        0: combat
        1: inn
        2:pet
        3: shop
        The book's boss is always on top of the map
         */
    }

    //this.bosses = new Boss[]{new Boss("Troll", 500, 500, 100, 75, 100, 50)};
    this.bookTitle = bookTitle;
    this.bookIntroduction=bookIntroduction;
    this.bookConclusion=bookConclusion;
    this.map = map;


   /* int[] combatCases = new int[2];
    int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];*/

   this.bookGameMap = new GameMap(map, casesPositions.get(0), casesPositions.get(1), casesPositions.get(2) , casesPositions.get(3));
}
    public void nextBook(Game game) {
        currentBook++;
        if (currentBook > 7) {
            //End game
        }
    }


   /*public void defineEncounters(String encounter){
        int book = this.getCurrentBook();
        switch (encounter){
            case "Battle":
                break;

            case "Inn":
                break;

            case "Boss":
                break;

            case "Shop":
                break;

            case "Nothing":
                break;
        }
   }
*/

  /* public void book1(){

    this.enemies.add(new Enemy("Troll", 500, 500, 100, 75, 100, 50));
    //this.bosses = new Boss[]{new Boss("Troll", 500, 500, 100, 75, 100, 50)};
    this.bookTitle = "The Philosopher's Stone";
    Spell Leviosa = new Spell();
    this.bookIntroduction="";
    this.bookConclusion="";

    int[] combatCases = new int[2];
     int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];

    GameMap book1Map = new GameMap(map,combatCases,innCase ,petCase , shopCase);
      }*/
      //TODO
    //  //List of books: book1,boo
    //List<Book> books = new ArrayList<>();
    //books.add(new Book()
/*
    public void book2(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Basilic")};
        bookTitle = "The Chamber Of Secrets";
            Spell Leviosa = new Spell();
    bookIntroduction="Vous êtes face au terrible basilic. Si vous êtes de Griffondor, vous pouvez faire appel à l’épée
légendaire de Godric Gryﬀindor pour le terrasser. Sinon, il faudra lui arracher un de ses crocs et
l’utiliser pour détruire le journal de Tom Jedusor.";
    bookConclusion="";

    int[][] combatCases = new int[5][2];
     int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];

    GameMap book2Map = new GameMap(map,combatCases,innCase ,petCase , shopCase);

    }

    public void book3(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Troll")};
        bookTitle = "The Prisonner of Azkaban";
            Spell Leviosa = new Spell();
    bookIntroduction="Les Détraqueurs sont en liberté. Ils errent dans les rues, les campagnes. Heureusement, vous avez
entendu parler d’un sort pour les mettre en fuite... Expect... Expecta... Ah oui, Expectro Patronum.
Votre objecif est d’apprendre le sort, puis de l’utiliser pour vaincre les Détraqueurs.";
    bookConclusion="";

    int[][] combatCases = new int[5][2];
     int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];

    GameMap book3Map = new GameMap(map,combatCases,innCase ,petCase , shopCase);

    }
    public void book4(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Voldemort"), new Boss("Peter Pettigrow")};
        bookTitle = "The Goblet of Fire";
            Spell Leviosa = new Spell();
    bookIntroduction="Par malheur, vous avez remporté le Tournoi des Trois Sorciers... et le droit de mourir. Vous êtes
dans un cimetière, où se trouvent aussi Voldemort et Peter Pettigrew. Votre seule chance de fuite est
de vous rapprocher du Portkey pour l’attirer à vous (Accio !). Ne vous inquiétez pas, vous reverrez
Voldemort";
    bookConclusion="";

    int[][] combatCases = new int[5][2];
     int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];

    GameMap book4Map = new GameMap(map,combatCases,innCase ,petCase , shopCase);
    }
    public void book5(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Dolores Ombrage")};
        bookTitle = "The Order of the Phenix";
            Spell Leviosa = new Spell();
    bookIntroduction="Vous devez affronter le méchant Troll qui se trouve dans les toilettes à côté du Donjon. Pour le\n" +
            "vaincre, vous devez soulever des objets et les relâcher lorsqu’ils se trouvent au-dessus de sa tête.";
    bookConclusion="";

    int[][] combatCases = new int[5][2];
     int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];

    GameMap book5Map = new GameMap(map,combatCases,innCase ,petCase , shopCase);
    }

    public void book6(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Troll")};
        bookTitle = "The Half-Blood Prince";
            Spell Leviosa = new Spell();
    bookIntroduction="Vous devez affronter le méchant Troll qui se trouve dans les toilettes à côté du Donjon. Pour le\n" +
            "vaincre, vous devez soulever des objets et les relâcher lorsqu’ils se trouvent au-dessus de sa tête.";
    bookConclusion="";

    int[][] combatCases = new int[5][2];
     int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];

    GameMap book6Map = new GameMap(map,combatCases,innCase ,petCase , shopCase);
    }


    public void book7(){
        enemies = {new Enemy(), new Enemy(), new Enemy(), new Enemy(), new Enemy()};
        bosses = {new Boss("Voldemort"), new Boss("Bellatrix Lestrange")};
        bookTitle = "The Deathly Hallows";
            Spell Leviosa = new Spell();
    bookIntroduction="Vous devez affronter le méchant Troll qui se trouve dans les toilettes à côté du Donjon. Pour le\n" +
            "vaincre, vous devez soulever des objets et les relâcher lorsqu’ils se trouvent au-dessus de sa tête.";
    bookConclusion="";

    int[][] combatCases = new int[5][2];
     int[] innCase = new int[2];
    int[] petCase= new int[2];
    int[] shopCase= new int[2];

    GameMap book1Map = new GameMap(map,combatCases,innCase ,petCaoose , shopCase);
    }


*/

    public List<AbstractEnemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<AbstractEnemy> enemies) {
        this.enemies = enemies;
    }



    public void setBookConclusion(String bookConclusion) {
        this.bookConclusion = bookConclusion;
    }

    public String getBookConclusion() {
        return bookConclusion;
    }


    public String getBookIntroduction() {
        return bookIntroduction;
    }

    public void setBookIntroduction(String bookIntroduction) {
        this.bookIntroduction = bookIntroduction;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public List<Boss> getBoss() {
        return boss;
    }

    public void setBoss(List<Boss> boss) {
        this.boss = boss;
    }

    public int getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(int currentBook) {
        this.currentBook = currentBook;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public List<int[]> getCasesPositions() {
        return casesPositions;
    }
}
