import ios.xml.Car;
import ios.xml.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Никита on 18.02.2017.
 */

public class TestXML {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/ios/spring-config.xml");
        Car car = (Car) context.getBean("audi");
        System.out.println(car);
        Driver driver = (Driver) context.getBean("nikita");
        System.out.println(driver);
    }

}
