import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n =  sc.nextInt();
        int temp = n;
        int rev = 0;        
        while (temp > 0) {
            rev = (rev*10)+(temp%10);
            temp/=10;
        }
        if(n==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
        sc.close();
    }
}
