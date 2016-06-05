package byui.cit260.dragonknight.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonmanJoel
 */
public class Game implements Serializable {
    
    private String menu;
    private String spell;
    private double playerLevel;
    private double hitPoints;

    public Game() {
    }
    
    

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public double getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(double playerLevel) {
        this.playerLevel = playerLevel;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.menu);
        hash = 67 * hash + Objects.hashCode(this.spell);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.playerLevel) ^ (Double.doubleToLongBits(this.playerLevel) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.hitPoints) ^ (Double.doubleToLongBits(this.hitPoints) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.playerLevel) != Double.doubleToLongBits(other.playerLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitPoints) != Double.doubleToLongBits(other.hitPoints)) {
            return false;
        }
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        if (!Objects.equals(this.spell, other.spell)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "menu=" + menu + ", spell=" + spell + ", playerLevel=" + playerLevel + ", hitPoints=" + hitPoints + '}';
    }

    public void SetPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
