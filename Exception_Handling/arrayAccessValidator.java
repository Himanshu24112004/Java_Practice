import java.util.Scanner;
import java.util.InputMismatchException;

public class arrayAccessValidator{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        try {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int index = sc.nextInt();
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid input.");
        }
        sc.close();
    }
}