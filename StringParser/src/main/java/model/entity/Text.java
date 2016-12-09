package model.entity;

import model.marker.Element;

import java.util.List;

/**
 * Text class
 *
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class Text extends Composite implements Element  {
    /**
     * child constructor
     * @param text
     */
    public Text(List<Element> text) {
        super(text);
    }

}
