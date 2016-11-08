package main.java;

/**
 * Created by daniel.volkov on 08/11/16.
 */

public class Car {
    private String brand;
    private int cylinder;
    private int horsePower;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int cylinder, int horsePower) {
        this.brand = brand;
        this.cylinder = cylinder;
        this.horsePower = horsePower;
    }

    @SpecialAnnotation(enabled = false)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @SpecialAnnotation()
    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", cylinder=" + cylinder +
                ", horsePower=" + horsePower +
                '}';
    }
}
