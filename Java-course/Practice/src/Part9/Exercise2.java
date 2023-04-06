package Part9;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
    record Car(String brand, String mode, Year year){}

    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car("Nissan", "Skyline", Year.of(1993)));
        cars.add(new Car("Toyota", "Supra", Year.of(1989)));
        cars.add(new Car("BMW", "M3", Year.of(2003)));
        cars.add(new Car("Dodge", "Charger", Year.of(1963)));
        cars.add(new Car("Kia", "Rio", Year.of(2014)));
        cars.add(new Car("Nissan", "Skyline", Year.of(1993)));
        cars.add(new Car("Toyota", "Supra", Year.of(1989)));
        cars.add(new Car("BMW", "M3", Year.of(2003)));
        cars.add(new Car("Dodge", "Charger", Year.of(1963)));
        cars.add(new Car("Kia", "Rio", Year.of(2014)));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
