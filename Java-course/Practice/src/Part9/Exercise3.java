package Part9;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    record Car(String brand, String model, Year year){}

    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();

        cars.put("Brian", new Car("Nissan", "Skyline", Year.of(1993)));
        cars.put("Dora", new Car("Toyota", "Supra", Year.of(1989)));
        cars.put("Razor", new Car("BMW", "M3", Year.of(2003)));
        cars.put("Dominic", new Car("Dodge", "Charger", Year.of(1963)));
        cars.put("Pavel", new Car("Kia", "Rio", Year.of(2014)));

        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
        }
    }
}
