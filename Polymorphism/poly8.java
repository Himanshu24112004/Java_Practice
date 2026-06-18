class Animal{
    void move(){
        System.out.println("Animal moves!!");
    }
}
class Cheetah extends Animal{
    void move(){
        System.out.println("Cheetah runs at 120kmph!!");
    }
}
public class poly8 {
    public static void main(String[] args) {
        Animal a = new Cheetah();
        a.move();
    }
}
