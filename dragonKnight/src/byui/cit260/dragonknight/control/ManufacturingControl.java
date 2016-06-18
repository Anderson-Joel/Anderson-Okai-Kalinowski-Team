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
        if (resource <= -100 || amount <= -100 || item <= -100) {
            return -1;
         }
        if (resource <= 0.1 || amount <=0.1 || item <=0.1) {
            return -1;
         }

            
        double totalMult = resource * amount * item;  //return value will end up in toatlMulti
        
        return totalMult; // the funnction returns the product.
    }

    
}
