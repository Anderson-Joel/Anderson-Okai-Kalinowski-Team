package byui.cit260.dragonknight.model;

import java.io.Serializable;

/**
 *
 * @author DragonmanJoel
 */
public class Map implements Serializable {
    
    private int noOfColumns;
    private int noOfRows;
    
    private Location location;
    private Game game;
    

    public Map() {
    }

    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.noOfColumns;
        hash = 71 * hash + this.noOfRows;
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
        final Map other = (Map) obj;
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map2{" + "noOfColumns=" + noOfColumns + ", noOfRows=" + noOfRows + '}';
    }
    
    
    
}
