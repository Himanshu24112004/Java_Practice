import java.util.Scanner;

public class Smallestdigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        int min = 9;
        while (n>0) {
            if((n%10)<min){
                min = n%10;
            }
            n/=10;
        }
        System.out.println("Smallest Digit : "+min);
        sc.close();
    }
}

