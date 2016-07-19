/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.MovementController;
import byui.cit260.dragonknight.exception.LoseGameException;
import byui.cit260.dragonknight.exception.MovementException;
import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Location;
import dragonknight.DragonKnight;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gee
 */
class GameMenuView extends View {

    protected final BufferedReader keyboard = DragonKnight.getInFile();

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
                + "\nW - viewInventory"
                + "\nQ - Return to Main Menu"
                + "\n-----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {

            case "P":
                searchPeople();
                break;
            case "N":
                moveNorth();
                break;
            case "E":
                moveEast();
                break;
            case "S":
                moveSouth();
                break;
            case "W":
                moveWest();
                break;
            case "M":
                viewMap();
                break;
            case "L":
                viewCurrentLocation();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid option");
                break;

        }
        return false;
    }

    private void searchPeople() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        MovementController mc = new MovementController();
        try {
            mc.moveNorth(DragonKnight.getGame());
            System.out.println("You moved north");

        } catch (MovementException me) {
            System.out.println("You cannot move there");
        } catch (Exception e) {
        } finally {
            //always executes
            System.out.println("Finally executes");
        }
        //CHECK THIS LOCATION - IF A MONSTER EXISTS AT THIS LOCATION GO TO BATTLE VIEW
        this.viewCheckMonster();

    }

    private void moveEast() {
        MovementController mc = new MovementController();
        if (mc.moveEast(DragonKnight.getGame()) == false) {
            System.out.println("You cannot move towards that direction");
        }

        //CHECK THIS LOCATION - IF A MONSTER EXISTS AT THIS LOCATION GO TO BATTLE VIEW
        //This check should be done in the battle controller or movement controller.
        //Just a function that returns true if monster exists at location
        this.viewCheckMonster();
    }

    private void moveSouth() {
        MovementController mc = new MovementController();
        if (mc.moveSouth(DragonKnight.getGame()) == false) {
            System.out.println("You cannot move towards that direction");
        }
//        throw new LoseGameException();
        //CHECK THIS LOCATION - IF A MONSTER EXISTS AT THIS LOCATION GO TO BATTLE VIEW
        this.viewCheckMonster();

    }

    private void moveWest() {
        MovementController mc = new MovementController();
        if (mc.moveWest(DragonKnight.getGame()) == false) {
            System.out.println("You cannot move towards that direction");
        }

        this.viewCheckMonster();
    }

    private void viewMap() {
        System.out.println(DragonKnight.getGame().getMap().getMap());
    }

    private void viewCurrentLocation() {

        String input = "";
        try {
            input = keyboard.readLine();
        } catch (Exception e) {
            //baried
        }
        int myNum = 0;
        try {
            myNum = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Bad numeric input");
        }

        Location l = DragonKnight.getGame().getPlayer().getLocation();
        System.out.println("You are at (" + l.getRow() + ", " + l.getCol() + ")");
    }

    private void viewCheckMonster() {

        if (DragonKnight.getPlayer().getLocation().getMonster() != null) {
            BattleView bv = new BattleView();
            bv.display();
        }

    }

}
