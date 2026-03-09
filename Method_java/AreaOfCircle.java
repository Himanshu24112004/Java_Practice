import java.util.Scanner;

public class AreaOfCircle {
    public static void area(int rad){
        System.out.println("Area : "+(3.14*rad*rad));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad =sc.nextInt();
            area(rad);
            sc.close();
    }
}
