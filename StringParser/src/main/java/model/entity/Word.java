package model.entity;

import model.marker.Element;

import java.util.*;

/**
 * Word class
 *
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class Word extends Composite implements Element {

    /**
     * number of corresponding symbols
     */
    private int numberOfSpecificSymbols;

    /**
     * child Constructor
     * @param word
     */
    public Word(List<Element> word) {
        super(word);
    }

    /**
     * method for count number of symbol
     * @param inputSymbol number of which we will calculate
     */

    public void countNumbersBySymbol(char inputSymbol){
        numberOfSpecificSymbols = 0;
        inputSymbol = Character.toLowerCase(inputSymbol);

        for (char symbol : toString().toLowerCase().toCharArray()) {
            if (symbol == inputSymbol) {
                numberOfSpecificSymbols++;
            }
        }
    }

    /**
     * add element in to Word
     * @param element
     */
    public void addElement(Element element) {
        super.elements.add(element);

    }

    public int getNumberOfSpecificSymbols() {
        return numberOfSpecificSymbols;
    }

    /**
     * ovverring method toString
     * @return
     */
    @Override
    public String toString() {
        StringBuffer word = new StringBuffer();
        Iterator iterator = super.elements.iterator();
        while (iterator.hasNext()){
            Symbol symbol =(Symbol) iterator.next();
            word.append(symbol.getElement());
        }
        return word.toString();
    }

    /**
     * inner class ValueComparator for sorting words
     * this class help to sort words by number of specific symbols in word
     */
    public static class ValueComparator implements Comparator<Word> {
        /**
         * constructor
         */
        public ValueComparator() {

        }

        /**
         * Overriding compare method
         * @param o1
         * @param o2
         * @return
         */

        @Override
        public int compare(Word o1, Word o2) {
            if (o1.getNumberOfSpecificSymbols() >= o2.getNumberOfSpecificSymbols()) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
