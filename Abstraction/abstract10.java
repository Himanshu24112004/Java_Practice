abstract class Shape2D {
    abstract void draw();
    abstract void resize(double factor);
} 
class Rectangle extends Shape2D {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void draw() {
        System.out.printf("Drawing Rectangle: Width = %.1f, Height = %.1f\n", width, height);
    }

    void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
        System.out.printf("Rectangle resized by %.1fx ->[width = %.1f, Height = %.1f]\n", factor, width, height);
    }
}
class circle extends Shape2D {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.printf("Drawing Circle: Radius = %.1f\n", radius);
    }

    void resize(double factor) {
        this.radius *= factor;
        System.out.printf("Circle resized by %.1fx ->[Radius = %.1f]\n", factor, radius);
    }
}

public class abstract10 {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle(4, 5);
        Shape2D circle = new circle(3);

        rectangle.draw();
        rectangle.resize(1.5);
        rectangle.draw();

        System.out.println("----------------------------");

        circle.draw();
        circle.resize(2);
        circle.draw();
    }
}
