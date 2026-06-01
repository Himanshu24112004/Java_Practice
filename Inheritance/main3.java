import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

class Vehicle {
    void engine(){
        System.out.println("Start");
    }
}
class Bus extends Vehicle{
    void wheel(){
        System.out.println("4 wheels");
    }
}
class Train extends Vehicle{
    void wheel(){
        System.out.println("50 wheels");
    }
}

public class main3 {
    public static void main(String[] args) {
        Bus b= new Bus();
        Train t = new Train();
        b.engine();
        b.wheel();
        t.engine();
        t.wheel();
    }
}
