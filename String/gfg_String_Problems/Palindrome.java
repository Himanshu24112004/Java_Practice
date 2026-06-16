import java.util.Scanner;

class Palindrome {
    boolean passed(String s) {
        int n = s.length();
        int[] freq = new int[26];

        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int startSecond = (n % 2 == 0) ? mid : mid + 1;
        for (int i = startSecond; i < n; i++) {
            freq[s.charAt(i) - 'a']--;
        }

        for (int f : freq) {
            if (f != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String s = sc.nextLine();
          Palindrome sol = new Palindrome();
        boolean result = sol.passed(s);
        System.out.println("Is \"" + s + "\" a palindrome? " + result);
        sc.close();
    }
}
