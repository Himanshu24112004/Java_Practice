class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    double area(){
        return 0;
    }
}
class Circle extends Shape{
    double radius = 5;
    void draw(){
        System.out.println("Drawing Circle");
    }
    double area(){
        return Math.PI+*radius*radius;
    }
}
class Square extends Shape{
    double side = 4;
    void draw(){
        System.out.println("Drawing Square");
    }
    double area(){
        return side *side;
    }
}
class Triangle extends Shape{
    double base = 5;
    double height = 6;

    void draw(){
        System.out.println("Drawing Triangle");
    }
    double area(){
        return 0.5*base*height;
    }
}
public class inherit8 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Triangle();

        s1.draw();
        System.out.println("Circle Area :"+s1.area());

        s2.draw();
        System.out.println("Square Area : "+s2.area());

        s3.draw();
        System.out.println("Triangle Area :"+ s3.area());
    }
}
