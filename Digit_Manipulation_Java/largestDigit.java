import java.util.Scanner;

public class largestDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        int max =0;
        while (n>0) {
            if((n%10)>max){
                max = n%10;
            }
            n/=10;
        }
        System.out.println("Largest Digit : "+max);
        sc.close();
    }
}
