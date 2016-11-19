package main.food;


import main.food.vegetables.Vegetable;

import java.util.HashSet;
import java.util.Set;

/**
 * Entity class Salad
 * Created by daniel.volkov on 13/11/16.
 * @author daniel.volkov
 */
public class Salad implements Eatable {

    private String name;
    private double calories;
    /**
     * Collection of salad ingridients
     */
    Set<Vegetable> ingridients = new HashSet<>();

    /**
     * Constructor
     * @param name
     */
    public Salad(String name) {
        this.name = name;
    }

    public Set<Vegetable> getIngridients() {
        return ingridients;
    }

    public void setIngridients(Set<Vegetable> ingridients) {
        this.ingridients = ingridients;
    }

    /**
     * this method use for adding vegetable in to salad
     * @param vegetable
     */
    public void add (Vegetable vegetable){
        this.ingridients.add(vegetable);
    }
    @Override
    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

}
