import java.util.Scanner;

public class DigitsPowerCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 123;
        int temp = n;
        int count = 0;

        for(int t=n; t!=0; t/=10){
            count++;
        }
        int sum =0;
        for(; temp != 0; temp/=10){
            int d= temp %10;
            int p=1;
            for(int i=1; i<=count; i++){
                p*=d;
            }
            sum += p;
        }
        System.out.println(sum);
        sc.close();
    }
}


public class DigitsPowerCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 123;
        int temp = n;
        int count = 0;

        for(int t=n; t!=0; t/=10){
            count++;
        }
        int sum =0;
        for(; temp != 0; temp/=10){
            int d= temp %10;
            int p=1;
            for(int i=1; i<=count; i++){
                p*=d;
            }
            sum += p;
        }
        System.out.println(sum);
        sc.close();
    }
}


public class DigitsPowerCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 123;
        int temp = n;
        int count = 0;

        for(int t=n; t!=0; t/=10){
            count++;
        }
        int sum =0;
        for(; temp != 0; temp/=10){
            int d= temp %10;
            int p=1;
            for(int i=1; i<=count; i++){
                p*=d;
            }
            sum += p;
        }
        System.out.println(sum);
        sc.close();
    }
}
