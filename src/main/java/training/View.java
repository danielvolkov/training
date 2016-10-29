package training;

/**
 * Created by daniel on 28/10/16.
 */
public class View {
    /**
     * text constants
     */
    public static final String HELLO ="Hello! Let`s play the game!";
    public static final String INPUT_INT_NUM = " Try to guess a number: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    public static final String MORE_THAN = "Unfortunately, my number is more than ";
    public static final String LESS_THAN = "Unfortunately, my number is less than ";
    public static final String OUT_OF_RANGE = "What for? Pay attention!";
    public static final String RANGE = "Current range is between: ";
    public static final String AND = " and ";
    public static final String SPACE = " ";
    public static final String LOSE = "Sorry, you lose! My number was: ";
    public static final String CONGRATULATIONS = "Congratulations! You won! My number was: ";

    /**
     * method prints String message into console
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * method prints format message into console
     * use for print List of Attempts
     * @param message
     */
    public void printAttempts(String message){
        System.out.print(message);
    }

    /**
     * method prints String message and int value into console
     * @param message String
     * @param value int
     */
    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);

    }

    /**
     * method prints range with min and max value into console
     * @param message String
     * @param min int
     * @param max int
     */
    public void printRange(String message, int min, int max){
        System.out.println(message + min + AND + max);
    }

}
