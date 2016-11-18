package view;

import food.vegetables.Vegetable;
import kitchen.GlobConst;
import java.util.Set;

/**
 * View class
 * Created by daniel.volkov on 16/11/16.
 * @author daniel.volkov
 */
public class View {

    /**
     * util method prints set of vegetables
     * @param ingridients
     */
    public void printIngridients(Set<Vegetable> ingridients){
        System.out.println("---");
        for ( Vegetable vegetable:ingridients ) {
            System.out.println(vegetable.getName()+" "+vegetable.getCalories()+ GlobConst.KCAL);
        }
    }

}
