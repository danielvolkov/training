package main.food.vegetables;

/**
 * init enum for vegetables
 * Created by daniel.volkov on 13/11/16.
 * @author daniel.volkov
 */
public enum VegetablesEnum {
    TOMATO("Tomato","red",19),
    CUCUMBER("Cucumber","green",16),
    CABBAGE("Cabbage","white",43),
    RADISH("Radish","pink",25),
    PEPPER("Pepper","red",27),
    ONION("Onion","green",19);

    private String name;
    private String color;
    /**
     * Calories in Kcal per 100 gramm
     */
    private int calories;

    /**
     * Constructor
     * @param name
     * @param color
     * @param calories
     */
    VegetablesEnum(String name, String color, int calories) {
        this.name = name;
        this.color = color;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCalories() {
        return calories;
    }
}
