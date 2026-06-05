import java.util.Scanner;

public class UncommonChars {

    static String uncommonChars(String s1, String s2) {
        boolean[] inA = new boolean[26];
        boolean[] inB = new boolean[26];
        for (char c : s1.toCharArray()) inA[c - 'a'] = true;
        for (char c : s2.toCharArray()) inB[c - 'a'] = true;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (inA[i] != inB[i]) sb.append((char) ('a' + i));
        }
        return sb.length() == 0 ? "No uncommon characters found." : sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string (lowercase): ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string (lowercase): ");
        String s2 = sc.nextLine();

        System.out.println("Uncommon characters: " + uncommonChars(s1, s2));
        sc.close();
    }
}
