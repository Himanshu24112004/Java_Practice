class Circle{
    private double radius;
    
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double CalArea(){
        return 3.14*radius*radius;
    }

    public double calPeri(){
        return 2*3.14*radius;
    }

}
public class encap6 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(2.5);
        System.out.println(c.getRadius());
        System.out.println(c.CalArea());
        System.out.println(c.calPeri());
    }
}
