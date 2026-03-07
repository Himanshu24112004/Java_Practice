import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n =  sc.nextInt();
        int count = 0;
        System.out.print("Enter the target digit :");
        int target = sc.nextInt();
        while (n>0) {
            if(target == (n%10)){
                count++;
            }
            n/=10;
        }
        System.out.print("Frequency of "+target+" is "+count);
        sc.close();
    }
}
