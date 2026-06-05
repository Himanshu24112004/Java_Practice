import java.util.Scanner;

public class SnakeCase {

    static String snakeCase(String s) {
        return s.toLowerCase().replace(" ", "_");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to snake_case: ");
        String s = sc.nextLine();

        System.out.println("snake_case: \"" + snakeCase(s) + "\"");
        sc.close();
    }
}
