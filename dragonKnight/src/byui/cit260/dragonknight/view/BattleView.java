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
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert to uppercase
        
        switch (value) {
            case "F": //Fight
                this.fight();
                return true;
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

    private void fight() {
        System.out.println("*** Fight in battle  ***");
    }

    private void defend() {
        System.out.println("*** Defend in battle ***");
    }
    
    private void magic() {
        System.out.println("*** Use magic in battle  ***");
    }

    private void useItem() {
        System.out.println("*** Use item in battle ***");
    }
}
