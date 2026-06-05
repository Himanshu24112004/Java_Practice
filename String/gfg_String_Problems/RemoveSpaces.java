import java.util.Scanner;

public class RemoveSpaces {

    static String removeSpaces(String s) {
        return s.replace(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Original : \"" + s + "\"");
        System.out.println("After removing spaces: \"" + removeSpaces(s) + "\"");
        sc.close();
    }
}
