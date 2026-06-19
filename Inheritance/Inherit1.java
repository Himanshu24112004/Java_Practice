class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Bird extends Animal{
     void sound(){
        System.out.println(Bird Chirps);
     }
}
Class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class Inherit1 {
    public static void main(String[] args) {
        Animal a1 = new Bird();
        Animal a2 = new  Cat();
        a1.sound();
        a2.sound();
    }
}
