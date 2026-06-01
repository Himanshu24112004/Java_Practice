class Shape{
    double getArea(){
        return 0;
    }

    double getPerimeter(){
        return 0;
    }
}

class Circle extends Shape{
    double radius = 5;
    @Override
    double getArea(){
        return 3.14*radius*radius;
    }

    @Override
    double getPerimeter(){
        return 2*3.14*radius;
    }
}

class Rectangle extends Shape{

    double len = 23;
    double wid = 45;

    @Override
    double getArea(){
        return len*wid;
    }

    @Override
    double getPerimeter(){
        return 2*(len+wid);
    }
}

class Triangle extends Shape{
    double a=2;
    double b=3;
    double c=6;

    @Override
    double getArea(){
        return 6;
    }

    @Override
    double getPerimeter(){
        return a+b+c;
    }
}
public class poly6 {
    public static void main(String[] args) {
        // Shape s1 = new Shape();
        Shape s2 = new Circle();
        Shape s3 = new Rectangle();
        Shape s4 = new Triangle();

        // s1.getArea();
        // s1.getPerimeter();
        System.out.println("Circle : "+ s2.getArea());
       System.out.println("Circle Perimeter : "+ s2.getPerimeter());
       System.out.println("Rectangle Area : "+ s3.getArea());
        System.out.println("Rectangle Perimeter : "+s3.getPerimeter());
        System.out.println("Triangle Area : "+s4.getArea());
        System.out.println("Triangle Perimeter : "+s4.getPerimeter());
    }
}
