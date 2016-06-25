package byui.cit260.dragonknight.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonmanJoel
 */
public class Weapon implements Serializable {
    
    private String name;
    private double attack;
    private double defence;
    private double magic;
    private double magicDefence;
    
    private Game game;
    private Inventory inventory;
    private Player player;
    

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getMagic() {
        return magic;
    }

    public void setMagic(double magic) {
        this.magic = magic;
    }

    public double getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(double magicDefence) {
        this.magicDefence = magicDefence;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.defence) ^ (Double.doubleToLongBits(this.defence) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.magic) ^ (Double.doubleToLongBits(this.magic) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.magicDefence) ^ (Double.doubleToLongBits(this.magicDefence) >>> 32));
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
        final Weapon other = (Weapon) obj;
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defence) != Double.doubleToLongBits(other.defence)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magic) != Double.doubleToLongBits(other.magic)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magicDefence) != Double.doubleToLongBits(other.magicDefence)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", attack=" + attack + ", defence=" + defence + ", magic=" + magic + ", magicDefence=" + magicDefence + '}';
    }
    
    
    
}
