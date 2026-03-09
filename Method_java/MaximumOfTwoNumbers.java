import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void max(int x, int y){
        System.out.println("Maximum Number : "+ (x>y?x:y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        max(a, b);
        sc.close();
    }
}
