package Part10;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    record Car(String brand, String model, Year year) {}

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Nissan", "Skyline", Year.of(1993)));
        cars.add(new Car("Toyota", "Supra", Year.of(1989)));
        cars.add(new Car("BMW", "M3", Year.of(2003)));
        cars.add(new Car("Dodge", "Charger", Year.of(1963)));
        cars.add(new Car("Kia", "Rio", Year.of(2014)));

        cars.stream()
                .filter(car -> car.year.isAfter(Year.of(1990)))
                .forEach(System.out::println);
    }
}
