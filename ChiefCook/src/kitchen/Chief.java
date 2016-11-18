package kitchen;

import food.Salad;
import food.vegetables.Vegetable;
import view.View;

import java.util.*;
import static food.vegetables.VegetablesEnum.*;

/**
 * Chief class
 * Created by daniel.volkov on 13/11/16.
 * @author daniel.volkov
 */
public class Chief {
    private String name;
    private View view;

    /**
     * Constructor
     * @param name
     */
    public Chief(String name,View view) {
        this.name = name;
        this.view = view;
    }

    /**
     * this method allows to Chief cook salad
     */
    public void cook() {
        Salad salad = prepeareSalad(GlobConst.SALAD_NAME);
        salad.setCalories(countCalories(salad));
        //sort ingridients with TreeSet and return new sorted Set in to salad
        salad.setIngridients(sortByCalories(salad.getIngridients()));
        view.printIngridients(salad.getIngridients());
        //range is from 10 to 27 Kcal
        Set<Vegetable> vegetablesByRange=findByCalories(salad,GlobConst.MIN_CALORIES_RANGE,
                GlobConst.MAX_CALORIES_RANGE);
        view.printIngridients(vegetablesByRange);
    }

    /**
     * this method use for prepare ingridients for salad
     * adding vegetables sigue Recipe
     * @param name of salad
     * @return salad object with ingridients
     */
    public Salad prepeareSalad(String name) {
        Salad salad = new Salad(name);
        salad.add( new Vegetable(TOMATO.getName(),TOMATO.getColor(),TOMATO.getCalories(),
                Recipe.TOMATO.getWeight()));
        salad.add( new Vegetable(CUCUMBER.getName(),CUCUMBER.getColor(),CUCUMBER.getCalories(),
                Recipe.CUCUMBER.getWeight()));
        salad.add( new Vegetable(RADISH.getName(),RADISH.getColor(),RADISH.getCalories(),
                Recipe.RADISH.getWeight()));
        salad.add( new Vegetable(CABBAGE.getName(),CABBAGE.getColor(),CABBAGE.getCalories(),
                Recipe.CABBAGE.getWeight()));
        salad.add( new Vegetable(PEPPER.getName(),PEPPER.getColor(),PEPPER.getCalories(),
                Recipe.PEPPER.getWeight()));
        salad.add( new Vegetable(ONION.getName(),ONION.getColor(),ONION.getCalories(),
                Recipe.ONION.getWeight()));
        return salad;
    }

    /**
     * method for count calories in to salad
     * @param salad object
     * @return general calories
     */
    public double countCalories(Salad salad){
        double calories=0;
        for ( Vegetable vegetable:salad.getIngridients() ) {
            calories+=vegetable.getCalories();
        }
        return calories;
    }

    /**
     * method sort vegetables in order by calories of vegetables
     * @param ingridients
     * @return sorted THreeSet with ingridients ordered by calories
     */
    public Set<Vegetable> sortByCalories(Collection ingridients) {
        return new TreeSet<Vegetable>(ingridients);

    }

    /**
     * method finds vegetables in salad by calories from min max range
     * @param salad
     * @param min value of calories
     * @param max value of calories
     * @return vegetables which values of calories are between min and max
     */
    public Set<Vegetable> findByCalories(Salad salad, int min, int max) {
        Set<Vegetable> vegetablesByRange = new HashSet<>();
        for ( Vegetable vegetable : salad.getIngridients() ) {
            if ( vegetable.getCalories()>=min && vegetable.getCalories()<=max ){
                vegetablesByRange.add(vegetable);
            }
        }
        return vegetablesByRange;
    }

}
