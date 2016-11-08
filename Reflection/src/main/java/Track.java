package main.java;

/**
 * Created by daniel.volkov on 08/11/16.
 */
public class Track extends Car {
    private int capacity;

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Track(int capacity) {
        this.capacity = capacity;
    }

    public Track(String brand, int capacity) {
        super(brand);
        this.capacity = capacity;
    }

    public Track(String brand, int cylinder, int horsePower, int capacity) {
        super(brand, cylinder, horsePower);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Track{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
