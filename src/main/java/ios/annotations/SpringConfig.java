package ios.annotations;

import ios.annotations.Car.Car;
import ios.annotations.Car.CarImplement;
import ios.annotations.Driver.Driver;
import ios.annotations.Driver.DriverImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Никита on 18.02.2017.
 */

@Configuration
public class SpringConfig {

    @Bean(name = "car")
    public Car beanCar() {
        return new CarImplement("Audi");
    }

    @Bean(name = "driver")
    public Driver beanDriver() {
        return new DriverImplement("Nikita", "Beregulya", beanCar());
    }

}
