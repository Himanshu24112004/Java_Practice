import java.util.Scanner;

public class SumOfDigits {
    public static void sum(int n){
        int sum = 0 ;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
            sum(num);
            sc.close();
    }
}
