package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Hero;
import byui.cit260.dragonknight.model.Inventory;
import byui.cit260.dragonknight.model.Item;
import byui.cit260.dragonknight.model.Location;
import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.model.Scene;
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
        
                moveNPCToStartingLocation(gameMap);
        
        player.setLocation(gameMap.getLocation(0,0));
        
        DragonKnight.setGame(game);
        
    }

    public static void saveGame(Game game, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void moveNPCToStartingLocation(Map gameMap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
         
         


}
