import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n  =  sc.nextInt();
        int count = 0;
        while (n>0) {
            count++;
            n/=10;
        }
        System.out.print("Number of Digits : "+count);
        sc.close();
    }
}
