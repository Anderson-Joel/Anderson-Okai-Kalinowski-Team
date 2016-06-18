package byui.cit260.dragonknight.view;

import java.util.Scanner;

/**
 *
 * @author DragonmanJoel
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
	super("\n"
		  + "\n-----------------------------------------------"
		  + "\n| Help Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nG - What is the goal of the game"
		  + "\nM - How to move"
		  + "\nE - Estimate amount of resources"
		  + "\nH - Harvest resources"
                  + "\nD - Delivering resources to warehouse"
		  + "\nQ - Return to Main Menu"
		  + "\n-----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {

	value = value.toUpperCase(); // convert choice to upper case

	switch (value) {
		case "G": // What is the goal of the game
			goalGame();
			break;
		case "M": // How to move 
			howToMove();
			break;
		case "E": // Estimate amount of resources
			estimateResources();
			break;
		case "H": // Harvest resources
			harvestResources();
			break;
                case "D": // Delivering resources to warehouse
			deliverWarehouse();
			break;
		default:
			System.out.println("\n*** Invalid Selectino *** Try Again");
			break;
	}

	return false;
}

    private void goalGame() {
        System.out.println("*** Goal of the game ***");
    }

    private void howToMove() {
        System.out.println("*** How to move around in the game ***");
    }

    private void estimateResources() {
        System.out.println("*** Going to change later ***");
    }

    private void harvestResources() {
        System.out.println("*** Going to change later ***");
    }

    private void deliverWarehouse() {
        System.out.println("*** Going to change later ***");
    }
    
    
}
