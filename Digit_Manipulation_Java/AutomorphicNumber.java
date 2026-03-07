import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =  sc.nextInt();
        int sq = n*n;
        int temp = n;
        boolean isAuto = true;
        while (temp>0) {
            if(temp%10 != sq%10){
                isAuto = false;
                break;
            }
            temp/=10;
            sq/=10;
        }
        if(isAuto){
            System.out.print("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
        sc.close();
    }
}
