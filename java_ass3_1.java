class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    String fuelType;

    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }
}
class LuxuryCar extends Car {
    String feature;

    LuxuryCar(String brand, String model, int year,
              String fuelType, String feature) {
        super(brand, model, year, fuelType);
        this.feature = feature;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Feature: " + feature);
    }
}
public class java_ass3_1 {
    public static void main(String[] args) {
        LuxuryCar car =
            new LuxuryCar("Tesla", "Model S",
                          2023, "Electric", "Autopilot");                         
        car.display();
    }
}