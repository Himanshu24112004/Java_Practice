class Laptop{
    String Br;
    double ram;

    Laptop(String b, double r){
        Br = b;
        ram = r;
    }
    void display(){
        System.out.println("Brand : "+ Br);
        System.out.println("RAM : "+ram);
    }
}
public class laptop23 {
    public static void main(String[] args) {
        Laptop l = new Laptop("ASUS", 16.32);
        l.display();
    }
}
