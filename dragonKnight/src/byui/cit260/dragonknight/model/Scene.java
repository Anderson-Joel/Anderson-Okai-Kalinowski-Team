package byui.cit260.dragonknight.model;

import byui.cit260.dragonknight.enums.SceneType;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonmanJoel
 */
public class Scene implements Serializable{
    
    private String description;
    
    private Game game;
    private Location[] location;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + '}';
    }
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
        "The Dragons await to destroy,"
         +"nations are conquered,"
         +"heros are fallen"
         +"who will preveal?");
     startingScene.setMapSymbol(" ST ");
     startingScene.setBlocked(false);
     startingScene.setTravelTime(240);
     scenes[SceneType.start.ordinal()] = startingScene;
     
     Scene finishScene = new Scene();
     finishScene.setDescription(
     "Congratulation! Well done you have emerge victorious against the Evil Dragon Lord."
     +"You have just launced your ship of curious workmanship and "
     +"begun your journey to home.");
     finishScene.setMapSymbol( " FN ");
     finishScene.setBlocked(false);
     finishScene.setTravelTime((int) Double.POSITIVE_INFINITY);
     scenes[SceneType.finish.ordinal()] = finishScene;
     campScene.setDescription(
     "This is the camp where you work on building the ship.");
     campScene.setMapSymbol(" BY ");
     campScene.setBlocked(false);
     campScene.setTravelTime(600);
        Scene campScene = null;
     scenes[SceneType.camp.ordinal()] = campScene;
          
     
        
        return scenes;
    }
    
}
