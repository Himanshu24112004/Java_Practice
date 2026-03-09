import java.util.Scanner;

public class FactorialUsingMethod {
    public static void factorial(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact *= i;
        }
        System.out.println("Factorial : "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n= sc.nextInt();
            factorial(n);
            sc.close();
    }
}
