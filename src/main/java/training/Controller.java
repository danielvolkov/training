package training;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daniel on 28/10/16.
 */
public class Controller {

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
    public void processUser(){
        view.printMessage(View.HELLO);
        Scanner sc = new Scanner(System.in);

        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,
                GlobalConstants.PRIMARY_MAX_BARRIER);
        model.setSecretValue();

        while (!model.checkValue(inputIntValueWithScanner(sc))){ }
        view.printMessage(View.CONGRATULATIONS + model.getSecretValue());
    }

    /**
     * utility method for correct reading values from keyboard
     * @param sc
     * @return int
     */
    public int inputIntValueWithScanner(Scanner sc) {
        int res=0;
        showAttempts(model.getAttempts());
        view.printMessage(View.INPUT_INT_NUM);
        view.printRange(View.RANGE,model.getMin(),model.getMax());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_NUM);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.OUT_OF_RANGE
                        + View.WRONG_INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }

    /**
     * utility method
     * shows previous attempts in one line
     * @param attempts
     */
    public void showAttempts(List<Integer> attempts) {
        for (int attempt : attempts) {
            view.printAttempts(View.SPACE+attempt);
        }
        view.printMessage(View.SPACE);
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
        return (input>model.getMin() && input<model.getMax());
    }

}
