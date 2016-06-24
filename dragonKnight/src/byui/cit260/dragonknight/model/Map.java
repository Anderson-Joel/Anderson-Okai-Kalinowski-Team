package byui.cit260.dragonknight.model;

import java.io.Serializable;

/**
 *
 * @author DragonmanJoel
 */
public class Map implements Serializable {
    
    private double numberOfCol;
    private double numberOfRow;

    public Map() {
    }
    
    

    public double getNumberOfCol() {
        return numberOfCol;
    }

    public void setNumberOfCol(double numberOfCol) {
        this.numberOfCol = numberOfCol;
    }

    public double getNumberOfRow() {
        return numberOfRow;
    }

    public void setNumberOfRow(double numberOfRow) {
        this.numberOfRow = numberOfRow;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.numberOfCol) ^ (Double.doubleToLongBits(this.numberOfCol) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.numberOfRow) ^ (Double.doubleToLongBits(this.numberOfRow) >>> 32));
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
        if (Double.doubleToLongBits(this.numberOfCol) != Double.doubleToLongBits(other.numberOfCol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfRow) != Double.doubleToLongBits(other.numberOfRow)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "numberOfCol=" + numberOfCol + ", numberOfRow=" + numberOfRow + '}';
    }

}
