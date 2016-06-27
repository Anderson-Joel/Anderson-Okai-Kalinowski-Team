package byui.cit260.dragonknight.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DragonmanJoel
 */
public class Map implements Serializable {
    
    public static int noOfColumns = 25;
    public static int noOfRows = 25;
    
    private Location[][] locations;
    

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if( noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
        }
        
    this.noOfRows = noOfRows;
    this.noOfColumns = noOfColumns;
    
    // creates 2-D array for Location objects
    this.locations = new Location[noOfRows][noOfColumns];
    
    for (int row = 0; row < noOfRows; row++){
            for( int column = 0; column < noOfColumns; column++){
//                create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);

//                assign the Location objects to the current position in array
                locations[row][column] = location;
    }
    }
    
    }   

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        Map.noOfColumns = noOfColumns;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        Map.noOfRows = noOfRows;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Map.noOfColumns;
        hash = 71 * hash + Map.noOfRows;
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
        if (Map.noOfRows != other.noOfRows) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfColumns=" + noOfColumns + ", noOfRows=" + noOfRows + '}';
    }

    
    
    
    
}
