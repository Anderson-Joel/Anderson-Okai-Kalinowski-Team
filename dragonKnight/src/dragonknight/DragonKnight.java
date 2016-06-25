package dragonknight;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.view.StartProgramView;

/**
 *
 * @author DragonmanJoel
 */
public class DragonKnight {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    StartProgramView startProgramView = new StartProgramView();
	startProgramView.displayStartProgramView();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DragonKnight.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DragonKnight.player = player;
    }

    public static void setGame(Game g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object getGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
