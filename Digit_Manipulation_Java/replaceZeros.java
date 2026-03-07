import java.util.Scanner;

public class replaceZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int place=1;
        int newNumber = 0;
        while (n>0) {
            int d = n%10;
            if(d==0){
                d=1;
            }
            newNumber += d*place;
            place *= 10;
            n/=10;
        }
        System.out.println("New Number is "+ newNumber);
        sc.close();
    }
}
