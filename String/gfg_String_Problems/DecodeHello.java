import java.util.Scanner;

public class DecodeHello {

    static boolean decode(String S) {
        String target = "hello";
        int j = 0;
        for (int i = 0; i < S.length() && j < target.length(); i++) {
            if (S.charAt(i) == target.charAt(j)) j++;
        }
        return j == target.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it contains \"hello\" as subsequence: ");
        String s = sc.nextLine();

        if (decode(s))
            System.out.println("✓ \"hello\" CAN be formed as a subsequence from \"" + s + "\".");
        else
            System.out.println("✗ \"hello\" CANNOT be formed as a subsequence from \"" + s + "\".");

        sc.close();
    }
}
