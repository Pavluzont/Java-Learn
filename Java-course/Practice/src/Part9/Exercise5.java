package Part9;

import java.time.Year;
import java.util.Set;
import java.util.TreeSet;

public class Exercise5 {
    record Car(String make, String model, Year year) implements Comparable<Car> {
        @Override
        public int compareTo(Car o) {
            return this.model.compareTo(o.model);
        }
    }

    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
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