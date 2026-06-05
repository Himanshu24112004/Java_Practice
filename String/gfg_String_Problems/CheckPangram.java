import java.util.Scanner;

public class CheckPangram {

    static boolean checkPangram(String s) {
        boolean[] present = new boolean[26];
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') present[c - 'a'] = true;
        }
        for (boolean b : present) { if (!b) return false; }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence to check for pangram: ");
        String s = sc.nextLine();

        if (checkPangram(s))
            System.out.println("✓ \"" + s + "\" IS a pangram.");
        else
            System.out.println("✗ \"" + s + "\" is NOT a pangram.");

        sc.close();
    }
}
