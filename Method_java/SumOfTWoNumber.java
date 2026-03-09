import java.util.Scanner;

public class SumOfTWoNumber{
    public static void Add(int a, int b){
        int sum = a+b;
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Add(x,y);
        sc.close();
    }
}