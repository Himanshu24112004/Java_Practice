abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{
    Lion(String name){
        super("Lion");
    }
    void eat(){
        System.out.println(name + " hunts and eats large prey like deer and buffalo.");
    }
    void sleep(){
        System.out.println(name + " sleeps up to 20 hours a day in the shade.");
    }
}
class Tiger extends Animal{
    Tiger(String name){
        super("Tiger");
    }
    void eat(){
        System.out.println(name + " is solitary hunter - stalks and ambushes its prey.");
    }
    void sleep(){
        System.out.println(name + " sleeps 16 - 18 hours and is most active at dusk and dawn.");
    }
}
class Deer extends Animal{
    Deer(String name){
        super("Deer");
    }
    void eat(){
        System.out.println(name + " grazes on grass, leaves, and shoots.");
    }
    void sleep(){
        System.out.println(name + "sleeps in short bursts, remaining alert for predators.");
    }
}
public class abstract4 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Lion("Lion"),
            new Tiger("Tiger"),
            new Deer("Deer")
        };
        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.name);
            animal.eat();
            animal.sleep();
            System.out.println("----------------------------");
        }
    }
}
