import java.util.Scanner;
import java.util.InputMismatchException;

public class safeDivision {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        }
        sc.close();
    }
}