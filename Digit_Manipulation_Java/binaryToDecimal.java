import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number( 0 & 1) :");
        int n = sc.nextInt();
        int decimal =0;
        int base =1;
        while (n>0) {
            int d = n%10;
            decimal += d*base;
            base *= 2;
            n/=10;
        }
        System.out.print("Decimal number is : "+decimal);
        sc.close();
    }
}
