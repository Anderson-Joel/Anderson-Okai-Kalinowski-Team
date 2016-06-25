package byui.cit260.dragonknight.model;

import java.io.Serializable;

/**
 *
 * @author DragonmanJoel
 */
public class Map implements Serializable {

    public static double NUM_ROWS;
    public static double NUM_COLS;
    
    
    private Location[][] locations;
    private int noOfColumns;
    private int noOfRows;
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
}

    public Map() {
    }
     public Map(int noOfRows, int noOfColumns){
        
        if (noOfRows < 1 || noOfColumns < 1){
            System.out.println("The number of rows and Columns must be > zero");
            return;
        }
  
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
//        create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++){
            for( int column = 0; column < noOfColumns; column++){
//                create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

//                assign the Location objects to the current position in array
                locations[row][column] = location;
            }
        }

    }
    
    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }
    
    
    public Location getCurrentLocation() {
        Location currentLocation = null;
        return currentLocation;
}  
    

}     
