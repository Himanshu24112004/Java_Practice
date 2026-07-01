import java.util.Scanner;

public class integerParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
        sc.close();
    }
}