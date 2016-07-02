package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Item;
import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.NPC;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.model.Scene;
import byui.cit260.dragonknight.model.Weapon;
import dragonknight.DragonKnight;
import java.awt.Point;

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
        
        game.setPlayer(player); // save player in game
        
        Item item = GameControl.createItem(); // create a new item
        game.setItem(item);
        
        Weapon[] weapon = GameControl.createWeapon(); // create a new item
        game.setItem(item);
        
        Map gameMap = new Map();
        game.setMap(gameMap);
        
                moveNPCToStartingLocation(gameMap);
        
        player.setLocation(gameMap.getLocation(0,0)); //move player to starting position in the map
        
        DragonKnight.setGame(game);
        
    }

    public static void saveGame(Game game, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int moveNPCToStartingLocation(Map map) {
        // for every NPC
        
        NPC[]  Npc = NPC.values();
       return 0;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Item createItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Weapon[] createWeapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
         
         


}
