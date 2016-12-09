package model.entity;

import model.marker.Element;

import java.util.List;

/**
 * Punctuation class
 * has enum of syntax elements
 *
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class Punctuation extends Composite implements Element{
    /**
     * child construnctor
     * @param punctuation
     */
    public Punctuation(List<Element> punctuation) {
        super(punctuation);
    }


    /**
     * enum of syntax
     * has main syntax symbols
     */
    public enum Syntax{
        POINT(". "),
        COMMA(", "),
        EXCLAMATION("! "),
        QUESTION("? ");

        private String syntax;

        /**
         * enum constructor
         * @param punctuation
         */
        Syntax(String punctuation) {
            this.syntax = punctuation;
        }

        public String getValue(){
            return syntax;
        }
    }

}
