abstarct class GeometricShape {
    abstract double area();
    abstract double perimeter();
}
class Triangle extends GeometricShape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double area() {
        return 0.5 * base * height;
    }

    double perimeter() {
        return sideA + sideB + sideC;
    }
}
class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 4 * side;
    }
}
public class abstract12 {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(5, 3, 5, 4, 6);
        GeometricShape square = new Square(4);

        System.out.printf("Triangle Area: %.2f\n", triangle.area());
        System.out.printf("Triangle Perimeter: %.2f\n", triangle.perimeter());

        System.out.printf("Square Area: %.2f\n", square.area());
        System.out.printf("Square Perimeter: %.2f\n", square.perimeter()); 
    }
}
