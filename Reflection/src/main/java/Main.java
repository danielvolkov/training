package main.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(GlobalConstants.CAR_BRAND,GlobalConstants.CAR_CYLINDER,
                GlobalConstants.CAR_HORSE_POWER);
        Track track = new Track(GlobalConstants.TRACK_BRAND,GlobalConstants.TRACK_CYLINDER,
                GlobalConstants.TRACK_HORSE_POWER,GlobalConstants.CAPACITY);
        System.out.println(car.toString());
        System.out.println(track.toString());
    }
}
