package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.exception.MapControlException;
import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Inventory;
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

    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game(); // Create new game
        DragonKnight.setGame(game); //save in DragonKnight
        
        game.setPlayer(player); // save player in game
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveNPCToStartingLocation(map);
        
        player.setLocation(map.getLocation(0,0)); //move player to starting position in the map
        
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

    public static Inventory[] createInventoryList() {
       
    // create array(list) of inventory
    Inventory[] inventory = new Inventory[10];
    
    Inventory potion = new Inventory();
    potion.setDescription("Potion");
    potion.setItemAmount(0);
    potion.setItemInStock(0);
    inventory[Item.potion.ordinal()] = potion;
    
    Inventory superPotion = new Inventory();
    superPotion.setDescription("Super Potion");
    superPotion.setItemAmount(0);
    superPotion.setItemInStock(0);
    inventory[Item.superPotion.ordinal()] = superPotion;
    
    Inventory megaPotion = new Inventory();
    megaPotion.setDescription("Mega Potion");
    megaPotion.setItemAmount(0);
    megaPotion.setItemInStock(0);
    inventory[Item.megaPotion.ordinal()] = megaPotion;
    
    Inventory xPotion = new Inventory();
    xPotion.setDescription("X-Potion");
    xPotion.setItemAmount(0);
    xPotion.setItemInStock(0);
    inventory[Item.xPotion.ordinal()] = xPotion;
    
    Inventory blackStone = new Inventory();
    blackStone.setDescription("Black Stone");
    blackStone.setItemAmount(0);
    blackStone.setItemInStock(0);
    inventory[Item.blackStone.ordinal()] = blackStone;
    
    Inventory whiteStone = new Inventory();
    whiteStone.setDescription("White Stone");
    whiteStone.setItemAmount(0);
    whiteStone.setItemInStock(0);
    inventory[Item.whiteStone.ordinal()] = whiteStone;
    
    Inventory shortSword = new Inventory();
    shortSword.setDescription("Short Sword");
    shortSword.setItemAmount(0);
    shortSword.setItemInStock(0);
    inventory[Weapon.shortSword.ordinal()] = shortSword;
    
    Inventory medSword = new Inventory();
    medSword.setDescription("Medium Sword");
    medSword.setItemAmount(0);
    medSword.setItemInStock(0);
    inventory[Weapon.medSword.ordinal()] = potion;
    
    Inventory longSword = new Inventory();
    longSword.setDescription("Long Sword");
    longSword.setItemAmount(0);
    longSword.setItemInStock(0);
    inventory[Weapon.longSword.ordinal()] = potion;
    
    Inventory dualSwords = new Inventory();
    dualSwords.setDescription("Dual Swords");
    dualSwords.setItemAmount(0);
    dualSwords.setItemInStock(0);
    inventory[Weapon.dualSwords.ordinal()] = potion;
    
    return inventory;
    }
     
         
         


}
