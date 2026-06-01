class Shape{
    void calculateArea(){
        System.out.println("Area calculated !!");
    }
}
class Cirlce extends Shape{
    void calculateArea(int r){
        System.out.println(3.14*r*r);
    }
}

class Rectangle extends Shape{
    void calculateArea(int l , int w ){
        System.out.println(l*w);
    } 
}

class Triangle extends Shape{
    void calculateArea(int b , int h){
        System.out.println((b*h)/2);
    }
}
public class poly3 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.calculateArea();
        Cirlce c= new Cirlce();
        c.calculateArea(30);
        Rectangle r= new Rectangle();
        r.calculateArea(5, 9);
        Triangle t = new Triangle();
        t.calculateArea(5, 6);
    }
}
