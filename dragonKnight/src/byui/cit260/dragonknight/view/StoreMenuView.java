package byui.cit260.dragonknight.view;

import java.util.Scanner;

/**
 *
 * @author DragonmanJoel
 */
public class StoreMenuView extends View {
    
    public StoreMenuView() {
	super("\n"
		  + "\n-----------------------------------------------"
		  + "\n| Store Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nB - Buy an item"
		  + "\nS - Sell Item"
		  + "\nQ - Return to Main Menu"
		  + "\n-----------------------------------------------");
    }

    
    @Override
    public boolean doAction(String value) {

	value = value.toUpperCase(); // convert choice to upper case

	switch (value) {
		case "B": // What is the goal of the game
			buyItem();
			break;
		case "S": // How to move 
			sellItem();
			break;
		default:
			System.out.println("\n*** Invalid Selectino *** Try Again");
			break;
	}

	return false;
}

    private void buyItem() {
        System.out.println("*** Buy item in the game  ***");
    }

    private void sellItem() {
        System.out.println("*** Sell item in the game ***");
    }
    
}
