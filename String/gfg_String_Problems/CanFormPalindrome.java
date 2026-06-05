import java.util.Scanner;

public class CanFormPalindrome {

    static boolean canFormPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        int oddCount = 0;
        for (int f : freq) { if (f % 2 != 0) oddCount++; }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String s = sc.nextLine();

        if (canFormPalindrome(s))
            System.out.println("\"" + s + "\" CAN be rearranged to form a palindrome.");
        else
            System.out.println("\"" + s + "\" CANNOT be rearranged to form a palindrome.");

        sc.close();
    }
}
