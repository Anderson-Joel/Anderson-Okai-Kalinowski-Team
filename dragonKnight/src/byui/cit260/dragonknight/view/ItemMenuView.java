/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.GameControl;

/**
 *
 * @author gee
 */

public class ItemMenuView extends View {
    GameControl game = new GameControl();
        
    public ItemMenuView() {
                super("\n"
                + "\n===================================="
                + "\n|             ITEM                 |"
                + "\n===================================="
                + "\n| Options:                         |"
                + "\n|        P. Potion                 |"
                + "\n|        F. Fire                   |"
                + "\n|        Q. Exit                   |"
                + "\n===================================="
                + "\nMake your Selection ~~~> ");
        
   }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert to uppercase
        
        switch (value) {
            case "P": //potion
                this.usePotion();
                return true;
            case "F": //Fire Scroll
                this.useFireScroll();
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void useFireScroll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void usePotion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}