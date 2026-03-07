class Rectangle {
    int len;
    int bre;

    void CalculateArea(){
        int area = len*bre;
        System.out.println("Area = "+area);
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.len=12;
        r1.bre=15;
        r1.CalculateArea();
    }
}
