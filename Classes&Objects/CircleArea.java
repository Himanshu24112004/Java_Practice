class Circle{
    double rad;

    void calculateArea(){
        double area =  3.14*rad*rad;
        System.out.println("Area: "+area);
    }
}
public class CircleArea {
    public static void main(String[] args) {
    Circle  c1 =new Circle();
    c1.rad=15;
    c1.calculateArea();
    }
}
