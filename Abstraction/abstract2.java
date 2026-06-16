abstact class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape {
    private double radius;
    Circle(double r) { this.radius = r; }
    double calculateArea() { return Math.PI * radius * radius; }
    double calculatePerimeter() { return 2 * Math.PI * radius; }
}
class Triangle extends Shape {
    private double a, b, c;
    Triangle(double side1, double side2, double side3) {
        this.a = side1;
        this.b = side2;
        this.c = side3;
    }
    double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class abstract2 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Triangle(3, 4, 5);

        System.out.printf("Circle Area: %.2f%n", s1.calculateArea());
        System.out.printf("Circle Perimeter: %.2f%n", s1.calculatePerimeter());

        System.out.printf("Triangle Area: %.2f%n", s2.calculateArea());
        System.out.printf("Triangle Perimeter: %.2f%n", s2.calculatePerimeter());
    }
}
