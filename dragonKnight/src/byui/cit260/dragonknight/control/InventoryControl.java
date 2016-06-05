package byui.cit260.dragonknight.control;

/**
 *
 * @author DragonmanJoel
 */
public class InventoryControl {
    int pocket;
            
            
    public int addToInventory(int total, int amount) {

        if (total < 0 || total >= 101 || amount < 0 || amount >= 101) {
            return -1;
        }
        
        if ((total + amount) >= 101){
            return -1;
        }
        
        int newTotal = total + amount;
        
        return newTotal;
        
    }
    
    public int removeFromInventory(int item, int amount) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101) {
            return -1;
        }
        
        if (amount > item){
            return -1;
        }
        
        int total = item - amount;

        return total;
        
    }
    
    public int storeItem(int item, int amount, int cost, int pocket) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101 || cost < 0 || cost > 50001 || pocket <= 0 || pocket > 1000001) {
            return -1;
        }
        
        cost = amount * cost;
        pocket = pocket - cost;

        return pocket;
        
    }
    
    public int sellItem(int item, int amount, int cost, int pocket) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101 || cost < 0 || cost > 50001 || pocket <= 0 || pocket > 1000001) {
            return -1;
        }
        
        cost = (amount * cost) / 2;
        pocket = pocket + cost;
        
        if (pocket > 1000000){
            return -1;
        }

        return pocket;
    }
    
}
