class Vehicle{
    void startEngine(){
        System.out.println("Vehicle engine started ");
    }
    void stopEngine(){
        System.out.println("Vehicle engine stopeed");
    }
}
class Car extends Vehicle {
    void startEngine(){
        System.out.println("Car engine starts with key ");
    }
    void stopEngine(){
        System.out.println("Car engine stops smoothly");
    }
}
class Motorcycle extends Vehicle{
    Void startEngine(){
        System.out.println("Motorcycle starts with self-start");
    }
    void stopEngine(){
        System.out.println("Motorcycle engine stops");
    }
}
public class inherit11 {
    public static void main(String[] args) {
       Vehicle v1 = new Car();
       Vehicle v2 = new Motorcycle();
       
       v1.startEngine();
       v1.stopEngine();

       v2.startEngine();
       v2.stopEngine();
    }
}
