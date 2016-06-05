package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.GameControl;
import dragonknight.DragonKnight;
import java.util.Scanner;

/**
 *
 * @author DragonmanJoel
 */
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
	this.menu = "\n"
		  + "\n-----------------------------------------------"
		  + "\n| Main Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nN - Start New Game"
		  + "\nG - Get and Start Saved Game"
		  + "\nH - Get help on how to play the game"
		  + "\nS - Save Game"
		  + "\nQ - Quit"
		  + "\n-----------------------------------------------";
    }
    
    
    
    public void displayMainMenuView() {

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
		case "N": // create and start a new game 
			this.startNewGame();
			break;
		case "G": // get and start an existing game 
			this.startExistingGame();
			break;
		case "H": // display the help menu 
			this.displayHelpMenu();
			break;
		case "S": // save the current game
			this.saveGame();
			break;
		default:
			System.out.println("\n*** Invalid Selectino *** Try Again");
			break;
	}

	return false;
}

    private void startNewGame() {
        // create new game
	GameControl.createNewGame(DragonKnight.getPlayer());

	// display the game menue
	GameMenuView gameMenu = new GameMenuView();
	gameMenu.displayMenu();
}

    private void startExistingGame() {
        System.out.println("*** startExsistingGame function called - NOT IMPLEMENTED YET ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** startSaveGame function called - NOT IMPLEMENTED YET ***");
    }

    
}
