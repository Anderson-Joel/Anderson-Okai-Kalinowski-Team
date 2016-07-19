package dragonknight;

import byui.cit260.dragonknight.model.Game;
import byui.cit260.dragonknight.model.Player;
import byui.cit260.dragonknight.view.MainMenuView;
import byui.cit260.dragonknight.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author DragonmanJoel
 */
public class DragonKnight {

    private static Game game;
    public static Player player;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        DragonKnight.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        DragonKnight.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInfile(BufferedReader infile) {
        DragonKnight.inFile = inFile;
    }

    public static void main(String[] args) {

        try {
            //open charcter stream files for end user input output
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            DragonKnight.logFile = new PrintWriter(filePath);

            // create StartProgram View and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

            return;

        } catch (Throwable e) {

            System.out.println("Exception:" + e.toString()
                    + "\nCause:" + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();;
        } finally {
            try {
                if (DragonKnight.inFile != null) {
                    DragonKnight.inFile.close();
                }

                if (DragonKnight.outFile != null) {
                    DragonKnight.outFile.close();
                }

                if (DragonKnight.logFile != null) {
                    DragonKnight.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }

        StartProgramView startProgramView = new StartProgramView();

        startProgramView.displayStartProgramView();

    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DragonKnight.player = player;
    }

    public static void setGame(Game game) {
        DragonKnight.game = game;
    }

    public static Game getGame() {
        return game;
    }
    
}
