import java.util.Scanner;

public class LengthString {

    static int lengthString(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Length of \"" + s + "\" is: " + lengthString(s));
        sc.close();
    }
}
