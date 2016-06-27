package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Inventory;
import byui.cit260.dragonknight.model.Item;
import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.model.Weapon;
import dragonknight.DragonKnight;

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
        DragonKnight.setCurrentGame(game); //save in DragonKnight
        
        game.SetPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
       
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // moves npcs to starting positions on the map
        MapControl.moveNPCToStartingLocation(map);
    }

    public static void saveGame(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Inventory[] createInventoryList() {
        Inventory[] inventory=
                new Inventory[10];
        
        Inventory potion = new Inventory();
        potion.setItemName("Potion");
        potion.setItemAmount(0);
        potion.setItemInStock(0);
        inventory[Item.potion.ordinal()] = potion;
        
        Inventory superPotion = new Inventory();
        superPotion.setItemName("Super Potion");
        superPotion.setItemAmount(0);
        superPotion.setItemInStock(0);
        inventory[Item.superPotion.ordinal()] = superPotion;
        
        Inventory megaPotion = new Inventory();
        megaPotion.setItemName("Mega Potion");
        megaPotion.setItemAmount(0);
        megaPotion.setItemInStock(0);
        inventory[Item.megaPotion.ordinal()] = megaPotion;
        
        Inventory xPotion = new Inventory();
        xPotion.setItemName("X-Potion");
        xPotion.setItemAmount(0);
        xPotion.setItemInStock(0);
        inventory[Item.xPotion.ordinal()] = xPotion;
        
        Inventory shortSword = new Inventory();
        shortSword.setItemName("Short Sword");
        shortSword.setItemAmount(0);
        shortSword.setItemInStock(0);
        inventory[Weapon.shortSword.ordinal()] = shortSword;
        
        Inventory medSword = new Inventory();
        medSword.setItemName("Medium Sword");
        medSword.setItemAmount(0);
        medSword.setItemInStock(0);
        inventory[Weapon.medSword.ordinal()] = medSword;
        
        Inventory longSword = new Inventory();
        longSword.setItemName("Long Sword");
        longSword.setItemAmount(0);
        longSword.setItemInStock(0);
        inventory[Weapon.longSword.ordinal()] = longSword;
        
        Inventory dualSwords = new Inventory();
        dualSwords.setItemName("Dual Swords");
        dualSwords.setItemAmount(0);
        dualSwords.setItemInStock(0);
        inventory[Weapon.dualSwords.ordinal()] = dualSwords;
        
        Inventory blackStone = new Inventory();
        blackStone.setItemName("Black Stone");
        blackStone.setItemAmount(0);
        blackStone.setItemInStock(0);
        inventory[Item.blackStone.ordinal()] = blackStone;
        
        Inventory whiteStone = new Inventory();
        whiteStone.setItemName("whiteStone");
        whiteStone.setItemAmount(0);
        whiteStone.setItemInStock(0);
        inventory[Item.whiteStone.ordinal()] = whiteStone;
        
        return inventory;
        
        
    }
    
}
