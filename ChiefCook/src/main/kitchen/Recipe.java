package main.kitchen;

/**
 * enum with Recipie of salad
 * Created by daniel.volkov on 15/11/16.
 * @author daniel.volkov
 */
public enum Recipe  {
    TOMATO(150),
    CUCUMBER(150),
    CABBAGE(100),
    RADISH(50),
    PEPPER(100),
    ONION(50);
    /**
     * weight of ingridients in gramms
     */
    private int weight;

    Recipe(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
