package training;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daniel on 28/10/16.
 */
public class Controller {
    /**
     * final static fields for range
     */
    public static final int MAX_INT = 100;
    public static final int MIN_INT = 0;

    /**
     * constructor for initialization model and view
     * @param model
     * @param view
     */
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    /**
     * main controller method works with user
     * contains logic loops and conditions
     */
    public void processUser() {
        view.printMessage(view.HELLO);
        model.setValue((int)(Math.random()*100));
        model.setMin(MIN_INT);
        model.setMax(MAX_INT);
        boolean equal=false;
        int currentValue;

        while (!equal) {
            Scanner sc = new Scanner(System.in);
            currentValue = validateInputValue(sc);
            model.addAttempts(currentValue);
            showAttempts(model.getAttempts());
            equal = model.compareValue(currentValue);

            if (model.getValue()>currentValue) {
                model.setMin(currentValue+1);
                view.printMessageAndInt(view.MORE_THAN, currentValue);
            } else if (model.getValue()<currentValue){
                model.setMax(currentValue-1);
                view.printMessageAndInt(view.LESS_THAN, currentValue);
            }
            islastChance();
        }
        view.printMessageAndInt(view.CONGRATULATIONS, model.getValue());
    }

    /**
     * utility method for correct reading values from keyboard
     * @param sc
     * @return int
     */
    public int inputIntValueWithScanner(Scanner sc) {
        view.printRange(view.RANGE,model.getMin(),model.getMax());
        view.printMessage(view.INPUT_INT_NUM);

        while(!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * utility method
     * shows previous attempts in one line
     * @param attempts
     */
    public void showAttempts(List<Integer> attempts) {
        for (int attempt : attempts) {
            view.printAttempts(view.SPACE+attempt);
        }
        view.printMessage(view.SPACE);
    }
    /**
     * utility method validates input value from keyboard
     * @param sc
     * @return int value from our range
     */
    public int validateInputValue(Scanner sc){
        int result=inputIntValueWithScanner(sc);
        while(!isBetweenCurrentRange(result)) {
            view.printMessage(view.OUT_OF_RANGE);
            result = inputIntValueWithScanner(sc);
        }
        return result;
    }
    /**
     * utility method
     * @param input
     * @return true if input is between min and max
     */
    public boolean isBetweenCurrentRange(int input) {
        return (input>=model.getMin() && input<=model.getMax());
    }
    /**
     * utility method
     * end the game if user lose
     * in case of no variants for choose
     */
    public void islastChance() {
        if (model.isZeroDifference()){
            view.printMessageAndInt(view.LOSE,model.getValue());
            System.exit(0);
        }
    }
}
