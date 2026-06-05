import java.util.Scanner;

public class IsGoodString {

    static String isGoodString(String s) {
        int n = s.length();
        if (n == 1) return "YES";
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            if (Math.min(diff, 26 - diff) != 1) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String s = sc.nextLine();

        String result = isGoodString(s);
        if (result.equals("YES"))
            System.out.println("\"" + s + "\" is a GOOD string (all consecutive chars differ by 1 cyclically).");
        else
            System.out.println("\"" + s + "\" is NOT a good string.");

        sc.close();
    }
}
