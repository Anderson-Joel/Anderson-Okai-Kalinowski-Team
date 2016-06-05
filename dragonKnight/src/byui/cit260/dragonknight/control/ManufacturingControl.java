package byui.cit260.dragonknight.control;

/**
 *
 * @author gee
 */
public class ManufacturingControl {
    
    public double calculateManufactureSpell (double resource, double amount, double item) {
     
        if (resource <= 0 || amount <=0 || item <=0) {
            return -1;
        }
            
        double totalMult = resource * amount * item;
        
        return totalMult;
    }

    
}
