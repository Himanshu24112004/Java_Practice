class Shape{
    double area(){
        return 0;
    }
}
class Circle extends Shape {
    double radius = 5;
    double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double length = 4;
    double breadth = 6;

    double area(){
        return length*breadth;
    }
}
class Triangle extends shape{
        double base = 5;
        double height = 8;

        double area(){
            return 0.5*base*height;
        }
}
public class inherit3 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        System.out.println("Circle Area :"+s1.area());
        System.out.println("Reactangle Area :"+s2.area());
        System.out.println("Triangle Area :"+s3.area());
    }
}
