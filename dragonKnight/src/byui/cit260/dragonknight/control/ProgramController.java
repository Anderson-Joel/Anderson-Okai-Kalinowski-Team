/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.model.Hero;
import dragonknight.DragonKnight;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gee
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName) {
        
        if(playerName == null) {
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
    }
    
    public static void createNewGame(Player player){
        
        Game g = new Game() ;
        g.setPlayer(player);
        
        Map gameMap = new Map ();
        g.setMap (gameMap);
        
        populateMapWithHeroes(gameMap);
        
        DragonKnight.setGame(g);
    }
    
     public static void populateMapWithHeroes(Map map) {
         
         List<Hero> heroes = createHeroList();
         
         for (Hero h: heroes) {
             
             
             
             int row = (int)(Math.random() * Map.NUM_ROWS) ;
             int col = (int)(Math.random() * Map.NUM_COLS) ;
             
      
             
         }
     }
    
     public static List<Hero> createHeroList() {
         
         List<Hero> heroList = new ArrayList<>();
         
         Hero flash = new Hero();
         flash.setName("flash");
         flash.setHitpoints(10);
         flash.setAttackpoints(2);
         heroList.add(flash);
         
         Hero ironman = new Hero();
         ironman.setName("ironman");
         ironman.setHitpoints(5);
         ironman.setAttackpoints(4);
         heroList.add(ironman);
         
         
         
         return heroList;
         
         
     }

    private static void setHero(Hero h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
