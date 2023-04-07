package Part10;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exercise3 {
    public static void main(String[] args) {
        List<Exercise2.Car> cars = new ArrayList<>();
        record Car(String brand, String model, Year year) {}
        Stream.of(new Exercise2.Car("Nissan", "Skyline", Year.of(1993)), new Exercise2.Car("Toyota", "Supra", Year.of(1989)))
                .forEach(System.out::println);
    }
}
