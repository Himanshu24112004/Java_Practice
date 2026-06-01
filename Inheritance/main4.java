class person {
    String name ="rahul";

}

class developer extends person {
    String name = "aman";
    void display(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
public class main4 {
    public static void main(String[] args) {
        developer d= new developer();
        d.display();
    }
}


class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    super.sound();
    System.out.println("Dog barks");
}

public class main4 {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
    }
}


class Animal{
    Animal(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog barks");
    }
}

public class main4 {
    public static void main(String[] args) {
        Dog d= new Dog();
    }
}