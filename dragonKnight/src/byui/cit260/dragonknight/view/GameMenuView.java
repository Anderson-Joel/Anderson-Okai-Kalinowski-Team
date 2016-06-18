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
class GameMenuView extends View{

    public GameMenuView() {
	super("\n"
		  + "\n-----------------------------------------------"
		  + "\n| Game Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nW - Weapons"
		  + "\nM - Show Map"
		  + "\nE - Buy Item"
		  + "\nH - Help Menu"
		  + "\nQ - Return to Main Menu"
		  + "\n-----------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String value) {

	value = value.toUpperCase(); // convert choice to upper case

	switch (value) {
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
                case  "Q"    :
                    return true;
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


