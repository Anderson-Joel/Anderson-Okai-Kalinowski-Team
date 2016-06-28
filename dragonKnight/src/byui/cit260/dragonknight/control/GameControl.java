package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Hero;
import byui.cit260.dragonknight.model.Inventory;
import byui.cit260.dragonknight.model.Item;
import byui.cit260.dragonknight.model.Location;
import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.model.Weapon;
import dragonknight.DragonKnight;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DragonmanJoel
 */
public class GameControl {

    public static Player createPlayer(String name) {

		if (name == null) {

			return null;
		}

		Player player = new Player();
		player.setName(name);

		DragonKnight.setPlayer(player); // save the player

		return player;

	}

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // Create new game
        DragonKnight.setGame(game); //save in DragonKnight
        
        game.SetPlayer(player); // save player in game
        
        Map gameMap = new Map();
        game.setMap(gameMap);
        
                populateMapWithHeroes(gameMap);
        
        player.setLocation(gameMap.getLocation(0,0));
        
        DragonKnight.setGame(game);
        
    }
     public static void populateMapWithHeroes(Map map) {
                 
         List<Hero> heroes = createHeroList();
         boolean sucess = false;
         for (Hero h: heroes) {
          
             do {
                 int row = (int)(Math.random() * Map.NUM_ROWS) ;
             int col = (int)(Math.random() * Map.NUM_COLS) ;
             
            sucess = false;
             
             if(map.getLocation(row,col).getHero()  !=null){
                    map.getLocation(row, col).setHero(h);
                 sucess = true;
                 }
          
             
             } while(sucess == false);
             
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

    public static void saveGame(Game game, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
