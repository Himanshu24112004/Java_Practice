abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    double calculateVolume() {
        return Math.pow(side, 3);
    }

    double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}
public class abstract6 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(5);
        Shape3D cube = new Cube(4);

        System.out.printf("Sphere Volume: %.2f\n", sphere.calculateVolume());
        System.out.printf("Sphere Surface Area: %.2f\n", sphere.calculateSurfaceArea());

        System.out.printf("Cube Volume: %.2f\n", cube.calculateVolume());
        System.out.printf("Cube Surface Area: %.2f\n", cube.calculateSurfaceArea());
    }
}
