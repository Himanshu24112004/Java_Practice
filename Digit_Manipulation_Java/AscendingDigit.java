import java.util.Scanner;

public class AscendingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int prev = 10;
        boolean isAsc = true;
        while (n>0) {
            int d =n%10;
            if(d>prev){
                isAsc = false;
                break;
            }
            prev = d;
            n/=10;
        }
        if(isAsc){
            System.out.println("Ascending ");
        }
        else{
            System.out.print("Not Ascending");
        }
        sc.close();
    }
}
