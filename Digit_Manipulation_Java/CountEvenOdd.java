import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        int even=0,odd=0;
        while (n>0) {
            if((n%10)%2==0){
                even++;
            }
            else{
                odd++;
            }
            n/=10;
        }
        System.out.println("Even Numbers are "+even+" And, Odd Numbers are "+odd);
        sc.close();
    }
}
