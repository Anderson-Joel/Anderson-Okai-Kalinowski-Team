package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.GameControl;
import byui.cit260.dragonknight.model.Player;
import java.util.Scanner;

/**
 *
 * @author DragonmanJoel
 */
public class StartProgramView {
    
    private String promptMessage;
    private boolean menu;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
          "\n**************************************************************"
        + "\n**************************************************************"
        + "\n**************************************************************"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*--------------------Insert Story Here-----------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n*------------------------------------------------------------*"
        + "\n**************************************************************"
        + "\n**************************************************************"
        + "\n**************************************************************" 
        );
    }

    public void displayStartProgramView() {
        
        	boolean done = false; //set flag to not done
	do {
            //promptfor and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quite
                return; // exit the game

		//do the requested action and display the next view
		done = this.doAction(playersName);

	} while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
	String value = ""; // value to be returned
	boolean valid = false; // initialize to no valid

	while (!valid) {  //loop while an invalid value is enter 
		System.out.println("\n" + this.promptMessage);

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

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
		System.out.println("\nInvalid players name: The name must be greater than one character in length");
		return false;

	}

	// call createPlayer() control function
	Player player = GameControl.createPlayer(playersName);
        

	if (player == null) {
		System.out.println("\nError creating the player.");
		return false;
	}
        
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n====================================================="
			+  "\n Welcome to the game " + player.getName()
			+  "\n We hope you have a lot of fun!"
			+  "\n====================================================="
			);
        
        // Create MainMenuView object
	MainMenuView mainMenuView = new MainMenuView();

    // Display the main menu view
    mainMenuView.displayMainMenuView();
    }
    
    
}
