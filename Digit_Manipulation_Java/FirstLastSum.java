import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int last = n%10;
        int first = n;
        while (first>=10) {
            first/=10;
        }
        System.out.println("Sum : "+(last+first));
        sc.close();
    }
}
