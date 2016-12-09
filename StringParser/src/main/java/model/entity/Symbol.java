package model.entity;

import model.marker.Element;



/**
 * Symbol class
 *
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class Symbol extends Composite implements Element {
    char simpleElement;

    /**
     * child constructor
     * @param simpleElement
     */
    public Symbol(char simpleElement) {
        super(null);
        this.simpleElement = simpleElement;
    }

    public void addElement(Element element) {
        throw new UnsupportedOperationException();
    }

    public char getElement() {
        return simpleElement;
    }

    public void setElement(char simpleElement) {
        this.simpleElement = simpleElement;
    }
}
