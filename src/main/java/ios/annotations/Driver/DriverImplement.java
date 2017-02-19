package ios.annotations.Driver;

import ios.annotations.Car.Car;

/**
 * Created by Никита on 18.02.2017.
 */

public class DriverImplement implements Driver {

    private String firstName;
    private String lastName;
    private Car car;

    public DriverImplement(String firstName, String lastName, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
    }

    public void firstName() {
        System.out.println(firstName);
    }

    public void lastName() {
        System.out.println(lastName);
    }

    public void car() {
        System.out.println(car);
    }

}
