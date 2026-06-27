import java.util.Scanner;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Calculator cal = new Calculator();
        
        if(n==2){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(cal.add(a,b));
        }
        if(n==3){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(cal.add(a, b, c));
        }
        sc.close();
    }
}
