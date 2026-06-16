abstract class Animal {
    abstract void sound();
}
class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }
}
class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger growls");
    }
}
 
public class abstract1 {
    public static void main(String[] args) {
        Animal a1 = new Lion();
        Animal a2 = new Tiger();
        a1.sound();
        a2.sound();
    }
}
