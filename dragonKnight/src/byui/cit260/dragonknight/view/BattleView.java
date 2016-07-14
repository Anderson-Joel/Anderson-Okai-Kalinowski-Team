package byui.cit260.dragonknight.view;

/**
 *
 * @author DragonmanJoel
 */
public class BattleView extends View {
    
     public BattleView() {
	super("\n"
		  + "\n-----------------------------------------------"
		  + "\n| Game Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nF - Fight"
		  + "\nD - Defend"
		  + "\nM - Magic"
		  + "\nI - Use Item"
		  + "\nQ - Quit and Run"
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
            case "I": //Run Away
                this.useItem();
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private boolean fight() {
        //TODO Use BattleController to apply damage to monster and receive damage
        //Throw loseGameException if your player dies.
        //If monster dies - inform player and end this view.
        System.out.println("*** Fight in battle  ***");
        
        return false; //false for not done / true for done
    }

    private void defend() {
        //TODO Use BattleController to apply damage to monster and receive damage 
        System.out.println("*** Defend in battle ***");
    }
    
    private void magic() {
        //TODO Use BattleController to apply damage to monster and receive damage
        System.out.println("*** Use magic in battle  ***");
    }
    
    //TODO maybe implement a run away option that has a chance to work.

    private void useItem() {
        //You could get rid of this I think
        System.out.println("*** Use item in battle ***");
    }
}
