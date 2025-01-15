package demo.kurs;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WH {

    // Declare the logger as a class-level field
    private static final Logger logger = Logger.getLogger(WH.class.getName());

    public static void main(String[] args) {
        // Log program start
        logger.info("Programm gestartet.");
        
        performTask();
        
        // Log program end
        logger.info("Programm beendet.");
    }

    private static void performTask() {
        // Print task completion message to console
        System.out.println("Aufgabe wurde durchgeführt");
        
        try {
            // Intentional division by zero to generate an exception
            int result = 10 / 0;
        } catch (Exception e) {
            // Log error details if an exception occurs
            logger.log(Level.SEVERE, "Fehler bei der Berechnung: ", e);
        }
    }
}
