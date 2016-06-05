package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Player;
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
        System.out.println("\n*** createNewGame stub function called ***");
        //Game g = new Game();
        //g.SetPlayer(player);
        //DragonKnight.setGame(g);
    }
    
}
