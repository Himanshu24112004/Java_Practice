import java.util.Scanner;

public class primesInRange {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
         
        for(int n= start; n<=end; n++){
            boolean isPrime = true;
            for(int i=2; i*i <= n; i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && n>1){
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}


public class primesInRange {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
         
        for(int n= start; n<=end; n++){
            boolean isPrime = true;
            for(int i=2; i*i <= n; i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && n>1){
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}



public class primesInRange {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
         
        for(int n= start; n<=end; n++){
            boolean isPrime = true;
            for(int i=2; i*i <= n; i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && n>1){
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}
