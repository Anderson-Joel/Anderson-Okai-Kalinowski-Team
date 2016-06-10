/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.view;

import java.util.Scanner;

/**
 *
 * @author gee
 */
class GameMenuView {

    private String menu;
    
    public GameMenuView() {
	this.menu = "\n"
		  + "\n-----------------------------------------------"
		  + "\n| Game Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nW - Weapons"
		  + "\nM - Show Map"
		  + "\nE - Buy Item"
		  + "\nH - Help Menu"
		  + "\nQ - Return to Main Menu"
		  + "\n-----------------------------------------------";
    }
    
    
    
    public void displayGameMenuView() {

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
			Weapon();
			break;
		case "M": // How to move 
			showtheMap();
			break;
		case "E": // Estimate amount of resources
			buyItem();
			break;
		case "H": // Harvest resources
			HelpMenu();
			break;
                case "D": // Delivering resources to warehouse
			returntoMainMenu();
			break;
		default:
			System.out.println("\n*** Invalid Selectino *** Try Again");
			break;
	}

	return false;
}

  
    private void Weapon() {
          System.out.println("*** Change weapon ***");
    }
    
    private void buyItem() {
          System.out.println("*** Buy an item ***");    }

    private void HelpMenu() {
        System.out.println("*** Go to Help Menu ***");
    }

    private void returntoMainMenu() {
          System.out.println("*** Return to Main Menu ***");
    }

    private void showtheMap() {
       System.out.println("*** Show Map ***");
    }

    void displayMenu() {
        System.out.println("*** return to Menu ***");
    }

   
    
}


