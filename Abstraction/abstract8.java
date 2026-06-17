abstract class Person {
    protected String name;
    Person(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void exercise();
}
class Athlete extends Person {
    Athlete(String name) {
        super(name);
    }
    void eat() {
        System.out.println(name + " eats a high-protein diet to build muscle.");
    }
    void exercise() {
        System.out.println(name + " (Athlete) trains 3 hours daily : cardio + strength+ stretching." );
    }
}
class LazyPerson extends Person {
    LazyPerson(String name) {
        super(name);
    }
    void eat() {
        System.out.println(name + " eats fast food and snacks and skips breakfast.");
    }
    void exercise() {
        System.out.println(name + " (Lazy Person) avoids physical activity and prefers sedentary pursuits.");
    }
}
public class abstract8 {
    public static void main(String[] args) {
        Person athlete = new Athlete("John");
        Person lazyPerson = new LazyPerson("Mike");

        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();

        System.out.println("\nLazy Person:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
