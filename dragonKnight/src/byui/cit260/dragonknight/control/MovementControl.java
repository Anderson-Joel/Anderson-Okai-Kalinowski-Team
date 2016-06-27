package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Location;
import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.Player;

/**
 *
 * @author DragonmanJoel
 */
public class MovementControl {
 
    public boolean north(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0) {
            return false;
        }
        
        int currentCol = currentLocation.getColumn();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        return true;
    }
    
    public boolean east(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getColumn() == Map.noOfColumns - 1) {
            return false;
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumns() + 1));
        
        return true;
    }
    
    public boolean moveSouth(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.noOfRows - 1) {
            return false;
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getColumns()));
        
        return true;
    }
    
    public boolean moveWest(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == 0) {
            return false;
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() - 1));
        
        return true;
    }
}
