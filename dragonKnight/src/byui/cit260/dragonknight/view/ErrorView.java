/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.view;

import dragonknight.DragonKnight;
import java.io.PrintWriter;

/**
 *
 * @author gee
 */
public class ErrorView {

    private static final PrintWriter errorFile = DragonKnight.getOutFile();
    private static final PrintWriter logFile = DragonKnight.getLogFile();
    
    public static void display(String className, String errorMessage) {
    
        errorFile.println(
                "----------------------------------------"
                +"\n-ERROR - " + errorMessage
                +"\n---------------------------------------");
                        
    // log error
    logFile.println(className + "-" + errorMessage);
    }

    static void display(String mainMenuView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
