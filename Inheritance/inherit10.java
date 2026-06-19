class Animal{
    void eat{
        System.out.println("Animal eats Food");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lion eats Meat");
    }
    void sound(){
        System.out.println("Lion roars");
    }
}
class Tiger extends Animal{
    Void eat(){
        System.out.println("Tiger eats flesh");
    }
    void sound (){
        System.out.println("Tiger growls");
    }
}
class Panther extends Animal{
    void eat(){
        System.out.println("Panther hunts animal");
    }
    void sound(){
        System.out.println("Panther snarls");
    }
}
public class inherit10 {
    public static void main(String[] args) {
        Animal a1 = new Lion();
        Animal a2 = new Tiger();
        Animal a3 = new Panther();

        a1.eat();
        a1.sound();

        a2.eat();
        a2.sound();

        a3.eat();
        a3.sound();
    }
}
