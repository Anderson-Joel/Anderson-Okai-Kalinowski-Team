package byui.cit260.dragonknight.view;

import java.util.Scanner;

/**
 *
 * @author DragonmanJoel
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
	this.menu = "\n"
		  + "\n-----------------------------------------------"
		  + "\n| Help Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nG - What is the goal of the game"
		  + "\nM - How to move"
		  + "\nE - Estimate amount of resources"
		  + "\nH - Harvest resources"
                  + "\nD - Delivering resources to warehouse"
		  + "\nQ - Return to Main Menu"
		  + "\n-----------------------------------------------";
    }
    
    
    
    public void displayHelpMenuView() {

	boolean done = false; // set flag to not done
	do {
		// prompt for and get players name
		String menuOption = this.getMenuOption();
		if (menuOption.toUpperCase().equals("Q")) // user wants to quit
			return; // exit the game


		// do the requested action and display the next view
		done = this.doAction(menuOption);

	} while (!done);

}

    private String getMenuOption() {
	Scanner keyboard = new Scanner(System.in); // get infile for keyboard
	String value = ""; // value to be returned
	boolean valid = false; // initialize to no valid

	while (!valid) {  //loop while an invalid value is enter 
		System.out.println(this.menu);

		value = keyboard.nextLine(); // get next line typed on keyboard
		value = value.trim(); // trim off leading and trailiing blanks

		if (value.length() <1 ) { // blanks
			System.out.println("\nInvalid value: value can not be blank");
			continue;

		}

		break; // end the loop

	}

	return value;  // return the value entered
}

    public boolean doAction(String choice) {

	choice = choice.toUpperCase(); // convert choice to upper case

	switch (choice) {
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
