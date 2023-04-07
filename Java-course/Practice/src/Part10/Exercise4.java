package Part10;

import java.time.Year;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Exercise4 {
    record Car(String brand, String model, Year year, int price) {}

    public static void main(String[] args) {
        int cars = Stream.of(
                new Car("Nissan", "Skyline", Year.of(1993), 90000),
                new Car("Toyota", "Supra", Year.of(1989), 135000),
                new Car("BMW", "M3", Year.of(2003), 110000),
                new Car("Dodge", "Charger", Year.of(1963), 110000),
                new Car("Kia", "Rio", Year.of(2014), 60000))
//                        .mapToInt(Car::price)
                        .collect(Collectors.summingInt(Car::price));
        System.out.println(cars);
    }
}
