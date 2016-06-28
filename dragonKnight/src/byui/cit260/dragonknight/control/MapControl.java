/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.control;

import byui.cit260.dragonknight.model.Map;
import byui.cit260.dragonknight.model.Scene;

/**
 *
 * @author gee
 */
public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(5,5);
        // create scenes
        Scene[] scenes = createScenes();
        //assign a scene to a location
        assignScenesToLocations(map, scenes);
        return map;

    
}

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void moveNPCToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
