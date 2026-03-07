import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        int sq = n*n;
        int sum = 0;
        while (sq>0) {
            sum += sq%10;
            sq/=10;
        }
        if(sum == n){
            System.out.print("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
        sc.close();
    }
}
