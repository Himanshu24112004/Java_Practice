import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Number(only three digits number): ");
        int n = sc.nextInt();
        int temp = n; 
        int sum =0;
        while (temp >0) {
            int d=temp%10;
            sum += d*d*d;
            temp/=10;
        }
        if(sum == n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
