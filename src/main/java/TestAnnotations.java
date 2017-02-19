import ios.annotations.Car.Car;
import ios.annotations.Driver.Driver;
import ios.annotations.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Никита on 18.02.2017.
 */

public class TestAnnotations {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);
        context.refresh();

        Car car = context.getBean("car", Car.class);
        car.model();

        System.out.println();

        Driver driver = context.getBean("driver", Driver.class);
        driver.firstName();
        driver.lastName();
        driver.car();

    }

}
