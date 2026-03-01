import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        for(;temp!=0; temp/=10){
            int d = temp%10;
            sum += d*d*d;
        }
        if(sum == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}


public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        for(;temp!=0; temp/=10){
            int d = temp%10;
            sum += d*d*d;
        }
        if(sum == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}


public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        for(;temp!=0; temp/=10){
            int d = temp%10;
            sum += d*d*d;
        }
        if(sum == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
