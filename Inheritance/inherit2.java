class Vehicle{
    int speed = 0;
    void speedUp(){
        speed += 10;
        System.out.println("Vehicle Speed: "+speed);
    }
}
class Car extends Vehicle{
    void speedUp(){
        speed += 30;
        System.out.println("Car Speed :"+speed);
    }
}
class Bicycle extends Vehicle{
    void speedUp(){
        speed += 15;
        System.out.println("Bicycle Speed: "+speed);
    }
}
public class inherit2 {
    public static void main(String[] args) {
       Vehicle v1 = new Car();
       Vehicle v2 = new Bicycle();
       
       v1.speedUp();
       v2.speedUp();
    }
}
