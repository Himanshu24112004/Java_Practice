class Animal{
    void Sound(){
        System.out.println("Animal is making sound!!!");
    }
}

class Cat extends Animal{
    void Sound(){
        System.out.println("meow!!");
    }
}

class Bird extends Animal{
    void Sound(){
        System.out.println("Chirp!!");
    }
}
public class poly1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Bird b = new Bird();
        a.Sound();
        c.Sound();
        b.Sound();
    }
    
}
