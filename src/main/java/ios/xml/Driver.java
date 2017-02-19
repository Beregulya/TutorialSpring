package ios.xml;

/**
 * Created by Никита on 18.02.2017.
 */

public class Driver {

    private String firstName;
    private String lastName;
    private Car car;

    public Driver(String firstName, String lastName, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Driver - " + firstName + " " + lastName + ", car - " + car + ".";
    }

}
