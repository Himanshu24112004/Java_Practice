import java.util.Scanner;

public class ReverseNumber {
    public static void Reverse(int a){
        int rev =  0;
        while(a>0){
            int d  = a%10;
            rev = rev*10 + d;
            a/=10;
        }
        System.out.println("Reverse : "+rev);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num =  sc.nextInt();
            Reverse(num);
            sc.close();
    }
}
