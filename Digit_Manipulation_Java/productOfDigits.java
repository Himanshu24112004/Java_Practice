import java.util.Scanner;

public class productOfDigits {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int prod =1;
        while (n>0) {
            prod *= n%10;
            n/=10;
        }
        System.out.println("Product : "+prod);
        sc.close();
    }
}
