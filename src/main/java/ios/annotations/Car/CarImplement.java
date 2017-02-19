package ios.annotations.Car;

/**
 * Created by Никита on 18.02.2017.
 */

public class CarImplement implements Car {

    private String model;

    public CarImplement(String model) {
        this.model = model;
    }

    public void model() {
        System.out.println(model);
    }

    @Override
    public String toString() {
        return model;
    }

}
