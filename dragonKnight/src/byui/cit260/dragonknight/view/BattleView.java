package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.MovementController;
import byui.cit260.dragonknight.control.BattleController;
import byui.cit260.dragonknight.exception.LoseGameException;
import byui.cit260.dragonknight.exception.MovementException;
import byui.cit260.dragonknight.model.Location;
import byui.cit260.dragonknight.model.Monster;
import byui.cit260.dragonknight.model.Player;
import dragonknight.DragonKnight;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DragonmanJoel
 * @author Andrew_Kalinowski
 */
public class BattleView extends View {

    public BattleView() {
        super("\n"
                + "\n-----------------------------------------------"
                + "\n| Game Menu                                    "
                + "\n-----------------------------------------------"
                + "\nF - Fight - Medium Damage given & received     "
                + "\nD - Defend - Low Damage given & received       "
                + "\nM - Magic - High Damage given & received       "
                + "\nR - Run Away"
                + "\n-----------------------------------------------");
    }

     //TODO OVERRIDE VIEW'S public void display () function
    //ADD ADDITIONAL OUTPUT INFORMING THE USER WHICH MONSTER THEY'VE RUN INTO
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert to uppercase

        switch (value) {
            case "F": //Fight
                return this.fight();
            case "D": //Defend
                this.defend();
                return true;
            case "M": //Magic
                this.magic();
                return true;
            case "R": //Run Away
                this.runAway();
                return true;
            //case "I": //Use Item     -- I commented this out - andrew
            //    this.useItem();
            //    return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private boolean fight() {

        System.out.println("*** Fight in battle  ***");
        //TODO Use BattleController to apply damage to monster and receive damage

        //Throw loseGameException if your player dies.
        //If monster dies - inform player and end this view.
        return true;
    }

    private void defend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void magic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void runAway() {
        BattleController bc = new BattleController();
        bc.runAway(DragonKnight.getPlayer(), DragonKnight.getPlayer().getLocation().getMonster());
    }

}

//Original private classes before I added Above - Andrew
/*
 private boolean defend() {
 //TODO Use BattleController to apply damage to monster and receive damage 
 System.out.println("*** Defend in battle ***");
 }
    
 private boolean magic() {
 //TODO Use BattleController to apply damage to monster and receive damage
 System.out.println("*** Use magic in battle  ***");
 }
    
 //TODO maybe implement a run away option that has a chance to work.

 private boolean useItem() {
 //You could get rid of this I think
 System.out.println("*** Use item in battle ***");
 }
 }

 */
