package byui.cit260.dragonknight.model;

/**
 *
 * @author DragonmanJoel
 */
public class Wallet {
   
    private int gold;

    public Wallet() {
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.gold;
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
        final Wallet other = (Wallet) obj;
        if (this.gold != other.gold) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wallet{" + "gold=" + gold + '}';
    }
    
    
    
}
