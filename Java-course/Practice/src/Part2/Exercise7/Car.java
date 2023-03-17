package Part2.Exercise7;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return "Car{" +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                '}';
    }

    public static void main(String[] args) {
        Car newCar = new Car("Nissan", "R34 Skyline");
        System.out.println(newCar);
    }
}
