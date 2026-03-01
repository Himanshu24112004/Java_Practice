import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp = n;
        int rev = 0;
        for(;temp!=0; temp/=10){
            rev = rev*10 + n%10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}


public class palindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp = n;
        int rev = 0;
        for(;temp!=0; temp/=10){
            rev = rev*10 + n%10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}


public class palindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp = n;
        int rev = 0;
        for(;temp!=0; temp/=10){
            rev = rev*10 + n%10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
