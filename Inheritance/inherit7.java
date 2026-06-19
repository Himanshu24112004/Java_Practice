class Animal{
    void move(){
        System.out.println("Animal Moves!!!");
    }
    void makeSound(){
        System.out.println("Animal makes sound!!");
    }
}
class Bird extends Animal{
    void move(){
        System.out.println("Bird flies in the sky");
    }
    void makeSound(){
        System.out.println("Bird Chirps");
    }
}
class Panther extends Animal{
    void move(){
        System.out.println("Panther runs Fast");
    }
    void makeSound(){
        System.out.println("Panther roars");
    }
}
public class inherit7 {
    public static void main(String[] args) {
        Animal a1 = new Bird();
        Animal a2 = new Panther();

        a1.move();
        a2.move();

        a1.makeSound();
        a2.makeSound();
    }
}
