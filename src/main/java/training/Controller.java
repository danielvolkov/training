package training;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Controller class for MoreOrLess game
 * @author daniel.volkov
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
        view.printMessage(View.ENTER_RANGE);
        view.printMessage(View.ENTER_MIN);
        Scanner sc = new Scanner(System.in);
        waitInt(sc);
        model.setMin(sc.nextInt());
        view.printMessage(View.ENTER_MAX);
        waitInt(sc);
        model.setMax(sc.nextInt());
       // model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,
               // GlobalConstants.PRIMARY_MAX_BARRIER);
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
        int[] res ={0} ;
        showAttempts(model.getAttempts());
        view.printMessage(View.INPUT_INT_NUM);
        view.printRange(View.RANGE,model.getMin(),model.getMax());

        while( true ) {
            // check int - value
            waitInt(sc);
            // check value in diapason
            if (checkRange(sc,res)){
                continue ;
            }
            break;
        }
        return res[0];
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
     * wait int value from scanner
     * @param sc
     */

    public void waitInt(Scanner sc){
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA
                    + View.INPUT_INT_NUM);
            sc.next();
        }
    }

    /**
     * checking value by range
     * @param sc
     * @return true if input value is from current range
     */
    public boolean checkRange(Scanner sc, int[] res){
        if ((res[0] = sc.nextInt()) <= model.getMinBarrier() ||
                res[0] >= model.getMaxBarrier()) {
            view.printMessage(View.OUT_OF_RANGE
                    + View.WRONG_INPUT_INT_DATA);
            return true;
        }
        return false;
    }

}
