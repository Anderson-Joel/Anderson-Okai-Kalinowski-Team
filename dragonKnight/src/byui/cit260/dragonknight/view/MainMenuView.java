package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.GameControl;
import byui.cit260.dragonknight.model.Game;
import dragonknight.DragonKnight;
import java.util.Scanner;

/**
 *
 * @author DragonmanJoel
 */

public class MainMenuView extends View{
    
    
    
    public MainMenuView() {
	super("\n"
		  + "\n-----------------------------------------------"
		  + "\n| Main Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nN - Start New Game"
		  + "\nG - Get and Start Saved Game"
		  + "\nH - Get help on how to play the game"
		  + "\nS - Save Game"
		  + "\nQ - Quit"
		  + "\n-----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

	value = value.toUpperCase(); // convert choice to upper case

	switch (value) {
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
                  case  "Q"    :
                    return true;       
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
       System.out.println("\n\nEnter the file path for file where the game " + "was saved last.");
String filePath = this.getInput();
  try {
            Game.getsaveGame(filePath);
        } catch (Exception ex){
            
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("\n\nEnter the file path for file where the game " + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(DragonKnight.getCurrentGame(), filePath);
        } catch (Exception ex){
            
}
    }

    void displayMainMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   
    

