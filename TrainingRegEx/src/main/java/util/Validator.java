package util;

import model.Group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validator class
 * Created by daniel.volkov on 05/11/16.
 */
public class Validator {

    /**
     * this method use for validate input string with regular expressions
     * @param inputString input string with needs to validate
     * @param regEx regular expression
     * @return true if input is valid
     */
    public static boolean validate(String inputString,String regEx){
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);
        if ( matcher.find() ){
            return true;
        } else {
            return false;
        }
    }

    /**
     * this method use for validate input string
     * @param inputString input string with group
     * @return true if input is valid
     */
    public static boolean validateGroup(String inputString){
        for (Group group:Group.values() ) {
            if (inputString.equals(group.toString())){
                return true;
            }
        }
        return false;

    }
}
