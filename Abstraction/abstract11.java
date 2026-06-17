abstract class Bird {
    protected String species;
    Bird(String species) {
        this.species = species;
    }
    abstract void fly();
    abstract void makeSound();
}
class Eagle extends Bird {
    Eagle(String species) {
        super(species);
    }
    void fly() {
        System.out.println(species + " (Eagle) soars high in the sky with powerful wings.");
    }
    void makeSound() {
        System.out.println(species + " (Eagle) screeches loudly.");
    }
}
class Hawk extends Bird {
    Hawk(String species) {
        super(species);
    }
    void fly() {
        System.out.println(species + " (Hawk) glides gracefully while hunting for prey.");
    }
    void makeSound() {
        System.out.println(species + " (Hawk) emits a sharp, piercing call.");
    }
}
public class abstract11 {
    public static void main(String[] args) {
        Bird[] birds = {
            new Eagle("Bald Eagle"),
            new Hawk("Red-tailed Hawk")
        };
        for (Bird bird : birds) {
            System.out.println("Bird: " + bird.species);
            bird.fly();
            bird.makeSound();
            System.out.println("----------------------------");
        }
    }
}
