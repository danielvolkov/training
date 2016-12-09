package model.entity;

import model.marker.Element;

import java.util.List;

/**
 * Created by daniel volkov on 04.12.2016.
 */
public class Sentence extends Composite implements Element{
    /**
     *
     * @param elements
     */
    public Sentence (List<Element> elements) {

        super(elements);
    }



}
