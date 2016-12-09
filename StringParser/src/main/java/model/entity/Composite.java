package model.entity;

import model.marker.Element;

import java.util.List;

/**
 * abstract Composite class
 * has collection of Elements
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public abstract class Composite<Element> {

    protected List<Element> elements;

    /**
     * Super constructor
     * @param elements
     */
    public Composite(List<Element> elements) {
        this.elements =  elements;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void addElement(Element element){
        elements.add(element);
    }

}
