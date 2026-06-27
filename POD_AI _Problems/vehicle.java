import java.util.Scanner;

class Vehicle{
    String brand;
    int speedLimit;

    Vehicle(String brand , int speedLimit){
        this.brand = brand;
        this.speedLimit = speedLimit;
    }
}
class Car extends Vehicle{
    int seats;

    Car(String brand, int speedLimit, int seats){
        super(brand, speedLimit);
        this.seats = seats;
    }
}
public class vehicle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String brand = sc.nextLine();
       int speed = sc.nextInt();
       int seat = sc.nextInt();

       Car car = new Car(brand, speed, seat);

        System.out.println("Brand: "+car.brand);
        System.out.println("Speed Limit: "+car.speedLimit);
        System.out.println("Seats: "+car.seats);
        System.out.println("Family Car: "+(seat>4 ? "Yes":"No"));

        sc.close();
    }
}
