import java.util.Scanner;

public class IsBinary {

    static boolean isBinary(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is binary: ");
        String s = sc.nextLine();

        if (isBinary(s))
            System.out.println("\"" + s + "\" is a valid binary string.");
        else
            System.out.println("\"" + s + "\" is NOT a valid binary string.");

        sc.close();
    }
}
