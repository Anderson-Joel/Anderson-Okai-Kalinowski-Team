package dragonknight;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.view.StartProgramView;

/**
 *
 * @author DragonmanJoel
 */
public class DragonKnight {
    
    private static Game game;
    public static Player player;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    StartProgramView startProgramView = new StartProgramView();
	startProgramView.displayStartProgramView();
        
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        DragonKnight.game = game;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DragonKnight.player = player;
    }

  

   
    
    
    
}
