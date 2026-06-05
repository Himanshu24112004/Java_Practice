import java.util.Scanner;

public class AreAnagrams {

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for (char c : s1.toCharArray()) freq[c - 'a']++;
        for (char c : s2.toCharArray()) freq[c - 'a']--;
        for (int f : freq) { if (f != 0) return false; }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string  (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string (s2): ");
        String s2 = sc.nextLine();

        if (areAnagrams(s1, s2))
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" ARE anagrams.");
        else
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are NOT anagrams.");

        sc.close();
    }
}
