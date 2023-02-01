import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {

        Car car1 = new Car("Altima", 13000);
        Car car2 = new Car("Durango", 4000);
        Car car3 = new Car("Mustang", 3000);
        Car[] cars = {car1, car2, car3};

        ArrayList<Car> carsList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carsList);
    }

}
