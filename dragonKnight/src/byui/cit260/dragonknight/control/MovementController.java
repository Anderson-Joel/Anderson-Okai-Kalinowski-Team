package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.exception.MovementException;
import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Location;
import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.Monster;
import byui.cit260.dragonknight.model.Player;

/**
 *
 * @author DragonmanJoel
 */
public class MovementController {
 
    public boolean moveNorth (Game game) throws MovementException  {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0) {
            throw new MovementException("You cannot move north");
        }
        
        
        int currentCol = currentLocation.getCol();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        return true;
    }
    
    public boolean moveEast(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == Map.NUM_COLS -1) {
            return false;
        }
        
        int currentCol = currentLocation.getCol();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        return true;
    }
    
       public boolean moveSouth(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.NUM_ROWS -1) {
            return false;
        }
        
        int currentCol = currentLocation.getCol();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow +1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        return true;
    }
        public boolean moveWest(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == 0) {
            return false;
        }
        
        int currentCol = currentLocation.getCol();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        return true;
    }
        
        public boolean checkForMonster(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Monster[] monster = game.getMonster();
        
        Monster[] checkFigure = game.getMonster();
        // if the monster is there then return true
        //need to implement this
    
            

        //   return true;
        // }
        // return false;
        
       
       //This is only to clear errors, use the if statement above
            return true;
        }
    
}
