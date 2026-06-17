abstract class Vehicle {
    protected String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }
    void startEngine() {
        System.out.println(brand + " Car : Turning the key - Vroom! The engine starts.");
    }
    void stopEngine() {
        System.out.println(brand + " Car : Key turned off - The engine stopped.");
    }
}
class Motorcycle extends Vehicle {
    Motorcycle(String brand) {
        super(brand);
    }
    void startEngine() {
        System.out.println(brand + " Motorcycle : Kicking-starting - Rrrm! Engine on.");
    }
    void stopEngine() {
        System.out.println(brand + " Motorcycle :Kill switch pressed - The engine stopped.");
    }
}
public class abstract7 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota"),
            new Motorcycle("Harley-Davidson")
        };
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.brand);
            vehicle.startEngine();
            vehicle.stopEngine();
            System.out.println("----------------------------");
        }
    }
}
