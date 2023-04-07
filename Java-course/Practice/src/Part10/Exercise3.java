package Part10;

import java.time.Year;
import java.util.stream.Stream;

public class Exercise3 {
    record Car(String brand, String model, Year year) {}
    public static void main(String[] args) {
        Stream.of(
                new Car("Nissan", "Skyline", Year.of(1993)),
                        new Car("Toyota", "Supra", Year.of(1989)),
                        new Car("BMW", "M3", Year.of(2003)),
                        new Car("Dodge", "Charger", Year.of(1963)),
                        new Car("Kia", "Rio", Year.of(2014)))
                .forEach(System.out::println);
    }
}
