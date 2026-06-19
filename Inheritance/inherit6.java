class Shape{
    double area(){
        return 0;
    }
    double perimeter(){
        return 0;
    }
}
class Circle extends Shape {
    double radius = 5;

    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return Math.PI*2*radius;
    }
}
class Rectangle extends Shape{
    double length = 4;
    double breadth = 6;
    
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
}
class Triangle extends Shape{
    double a=4;
    double b=3;
    double c=5;

    double area(){
        return 6;
    }

    double perimeter(){
        return a+b+c;
    }
}
public class inherit6 {
    public static void main(String[] args) {
      Shape s1 = new Circle();
      Shape s2 = new Rectangle();
      Shape s3 = new Triangle();
      
      System.out.println("Circle Area: "+s1.area());
      System.out.println("Circle Perimeter: "+s1.perimeter());

      System.out.println("Rectangle Area : "+s2.area());
      System.out.println("Rectangle Perimeter : "+s2.perimeter());

      System.out.println("Triangle Area :"+s3.area());
      System.out.println("Triangle Perimeter : "+s3.perimeter());
    }
}
