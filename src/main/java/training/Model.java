package training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 28/10/16.
 */
public class Model {
    private int secretValue;
    private int min;
    private int max;
    private List<Integer> attempts = new ArrayList<Integer>();
    // The Program logic
    /**
     * this method compares our random value with user input
     * @param value
     * @return boolean
     */
    public boolean checkValue (int value){
        if (value == secretValue){
            return true;
        } else if (value > secretValue){
            max = value;
            addAttempts(value);
        } else {
            min = value;
            addAttempts(value);
        }
        return false;
    }
    public void setPrimaryBarrier(int min, int max){
        this.min = min; // check
        this.max = max;
    }
    /**
     * getter for secretvalue
     * @return int
     */
    public int getSecretValue() {
        return secretValue;
    }
    /**
     * setter for secretValue
     * @return void
     */
    public void setSecretValue() {
        secretValue = (int)Math.ceil(Math.random() *
                (max - min -1) + min);
    }
    /**
     * getter for minimum value of range
     * @return int
     */
    public int getMin() {
        return min;
    }
    /**
     * setter for minimum value of range
     * @param min
     * @return void
     */
    public void setMin(int min) {
        this.min = min;
    }
    /**
     * getter for maximum value of range
     * @return int
     */
    public int getMax() {
        return max;
    }
    /**
     * setter for maximum value of range
     * @param max
     * @return void
     */
    public void setMax(int max) {
        this.max = max;
    }
    /**
     * getter for ArrayList with previous attempts
     * @return ArrayList
     */
    public List getAttempts() {
            return attempts;
    }
    /**
     * method add current attempt in ArrayList
     * @param attempt
     * @return void
     */
    public void addAttempts(int attempt) {
        this.attempts.add(attempt);
    }
    /**
     * method for
     * @return boolean returns true if difference between max and min equals zero
     */
    public boolean isZeroDifference(){
        return ((this.max - this.min)==0);
    }

    public int getMinBarrier() {
        return min;
    }

    public int getMaxBarrier() {
        return max;
    }
}