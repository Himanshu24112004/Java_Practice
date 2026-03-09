import java.util.Scanner;

public class SquareOfNumber {
    public static void Square(int n){
        int sq = n*n;
        System.out.println("Square : "+sq);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Square(x);
        sc.close();
    }
}
