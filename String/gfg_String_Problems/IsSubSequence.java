import java.util.Scanner;

public class IsSubSequence {

    static boolean isSubSeq(String s1, String s2) {
        int i = 0;
        for (int j = 0; j < s2.length() && i < s1.length(); j++) {
            if (s1.charAt(i) == s2.charAt(j)) i++;
        }
        return i == s1.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pattern string (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter the main string   (s2): ");
        String s2 = sc.nextLine();

        if (isSubSeq(s1, s2))
            System.out.println("\"" + s1 + "\" IS a subsequence of \"" + s2 + "\".");
        else
            System.out.println("\"" + s1 + "\" is NOT a subsequence of \"" + s2 + "\".");

        sc.close();
    }
}
