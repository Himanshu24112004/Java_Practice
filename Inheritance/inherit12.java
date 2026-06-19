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
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Shape{
    double radius = 5; 
    double height = 10;

    void draw(){
        System.out.println("Drawing Cylinder");
    }
    double area(){
        return 2*Math.PI*radius*(radius+height);
    }
}
public class inherit12 {
    public static void main(String[] args) {
       Shape s1 = new Circle();
       Shape s2 = new Cylinder();
       
       s1.draw();
       System.out.println("Circle Area : "+s1.area());
       
       s2.draw();
       System.out.println("Cylinder Surface Area :"+s2.area());
    }
}
