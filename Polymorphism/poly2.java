class Vehicle{
    void speedUp(){
        System.out.println("Speedup to 150kmph..");
    }
}
class Car  extends Vehicle{
    void speedUp(){
        System.out.println("speed up to 200kmph..");
    }
}
class Bicycle extends Vehicle{
    void speedUp(){
        System.out.println("speed up to 120kmph..");
    }
}
public class poly2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.speedUp();
        Car c = new Car();
        c.speedUp();
        Bicycle b =  new Bicycle();
        b.speedUp();
    }
}
