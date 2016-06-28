/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.MovementController;
import byui.cit260.dragonknight.model.Location;
import dragonknight.DragonKnight;
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
		  + "\nP - Search for people"
		  + "\nN - Move North"
		  + "\nE - Move East"
                  + "\nS - Move South"
		  + "\nW - Move West"
                  + "\nM - View Map"
                  + "\nL - View Current Location"
		  + "\nQ - Return to Main Menu"
		  + "\n-----------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String selection) {

	char charSel = selection.toUpperCase().charAt(0); // convert choice to upper case

	switch (charSel) {
            
            case 'P' :
                searchPeople();
                break;
                case 'N' :
                moveNorth();
                break;
                case 'E' :
                moveEast();
                break;
                case 'S' :
                moveSouth();
                break;
                case 'W' :
                moveWest();
                break;
                case 'M' :
                viewMap();
                break;
                case 'L' :
                viewCurrentLocation();
                break;
                case 'Q' :
                return true;
                default:
                    System.out.println("Invalid option");
                    break;
                
        }
           return false;
        }

    private void searchPeople() {
        System.out.println ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        MovementController mc = new MovementController();
        if (mc.moveNorth(DragonKnight.getGame()) == false){
            System.out.println("You cannot move towards that direction");
        };
    }

    private void moveEast() {
       MovementController mc = new MovementController();
        if (mc.moveEast(DragonKnight.getGame()) == false){
            System.out.println("You cannot move towards that direction");
        };
    }

    private void moveSouth() {
       MovementController mc = new MovementController();
        if (mc.moveSouth(DragonKnight.getGame()) == false){
            System.out.println("You cannot move towards that direction");
        };
    }

    private void moveWest() {
      MovementController mc = new MovementController();
        if (mc.moveWest(DragonKnight.getGame()) == false){
            System.out.println("You cannot move towards that direction");
        };
    }

    private void viewMap() {
        System.out.println(DragonKnight.getGame().getMap().getMapString());
    }

    void displayMenu() {
         System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   private void viewCurrentLocation() {
       Location l = DragonKnight.getGame().getPlayer().getLocation();
       System.out.println("You are at ("+ l.getRow() + ", " + l.getCol() + ")");
   } 
}
  
   