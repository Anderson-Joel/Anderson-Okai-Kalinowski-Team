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
    private SceneType sceneType;

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

    public SceneType getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneType sceneType) {
        this.sceneType = sceneType;
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
        "Evil has decended upon the land, "
         +"heros are falling, "
         +"and hope is disapearing."
         +"Will this evil preveal?"
        + "You have awaken in a cave with a fallen dragon" + "and have no memory of how you got there."
        + "The only thing that you can remember is to collect two special stones to stop"
        + "the Evil Dragon Lord from entering the kingdom.");
     startingScene.setMapSymbol(" ST ");
     startingScene.setBlocked(false);
     scenes[SceneType.start.ordinal()] = startingScene;
     
     Scene finishScene = new Scene();
     finishScene.setDescription(
     "Congratulation! Well done you have emerge victorious against the Evil Dragon Lord.");
     finishScene.setMapSymbol(" FN ");
     finishScene.setBlocked(false);
     scenes[SceneType.finish.ordinal()] = finishScene;
     
     Scene plain = new Scene();
     plain.setDescription("A gental brezze sweeping through the plains.");
     plain.setMapSymbol(" P ");
     plain.setBlocked(false);
     scenes[SceneType.plain.ordinal()] = plain;
     
     Scene water = new Scene();
     water.setDescription(
     "A really wet place.");
     water.setMapSymbol(" W ");
     water.setBlocked(false);
     scenes[SceneType.water.ordinal()] = water;
     
     Scene forest = new Scene();
     forest.setDescription(
     "Trees everywhere.");
     forest.setMapSymbol(" F ");
     forest.setBlocked(false);
     scenes[SceneType.forest.ordinal()] = forest;
     
     Scene town = new Scene();
     town.setDescription(
     "Small town where people live.");
     town.setMapSymbol(" T ");
     town.setBlocked(false);
     scenes[SceneType.town.ordinal()] = town;
     
     Scene store = new Scene();
     store.setDescription(
     "Time to buy.");
     store.setMapSymbol(" S ");
     store.setBlocked(false);
     scenes[SceneType.store.ordinal()] = store;
     
     Scene castle = new Scene();
     castle.setDescription(
     "Royalty lives here.");
     castle.setMapSymbol(" C ");
     castle.setBlocked(false);
     scenes[SceneType.castle.ordinal()] = castle;
     
     Scene darkArea = new Scene();
     darkArea.setDescription(
     "The Dark Lord lives.");
     darkArea.setMapSymbol(" DA ");
     darkArea.setBlocked(false);
     scenes[SceneType.darkArea.ordinal()] = darkArea;
     
     Scene cave = new Scene();
     cave.setDescription(
     "It's really dark in here.");
     cave.setMapSymbol(" Ca ");
     cave.setBlocked(false);
     scenes[SceneType.cave.ordinal()] = cave;
     
     Scene mountain = new Scene();
     mountain.setDescription(
     "You can see the entire kingdom here.");
     mountain.setMapSymbol(" M ");
     mountain.setBlocked(false);
     scenes[SceneType.mountain.ordinal()] = mountain;
     
        return scenes;
    }

    private void setMapSymbol(String _c_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
