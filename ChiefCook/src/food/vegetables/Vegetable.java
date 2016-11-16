package food.vegetables;


import food.Eatable;

/**
 * Vegetable entity
 * Created by daniel.volkov on 12/11/16.
 */
public class Vegetable implements Eatable, Comparable<Vegetable> {
    private String name;
    private String color;
    /**
     * weight in grams
     */
    private int weight;
    /**
     * calories per 100 grams (kcal)
     */
    private int specificCalorie;

    /**
     * general calories in vegetable
     */
    private double calories;

    /**
     * Constructor
     * @param name
     * @param color
     * @param specificCalorie
     * @param weight
     */

    public Vegetable(String name, String color, int specificCalorie, int weight) {
        this.name = name;
        this.color = color;
        this.specificCalorie = specificCalorie;
        this.weight = weight;
        countCalories();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    /**
     * this method count calories in Vegetable depends of weight
     */
    private void countCalories() {
        this.calories = (double) weight*specificCalorie/100;
    }

    public void setSpecificCalorie(int calority) {
        this.specificCalorie = calority;
    }

    public int getSpecificCalorie() {
        return specificCalorie;
    }

    @Override
    public double getCalories() {
        return calories;
    }

    /**
     * this method is overriding from Comparable interface
     * @param vegetable
     * @return difference between calories of Vegetables
     */
    @Override
    public int compareTo(Vegetable vegetable) {
        return (int) (this.calories-vegetable.calories);
    }
}
