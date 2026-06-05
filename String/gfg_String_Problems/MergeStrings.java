import java.util.Scanner;

public class MergeStrings {

    static String merge(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.max(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (i < s1.length()) sb.append(s1.charAt(i));
            if (i < s2.length()) sb.append(s2.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string  (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string (s2): ");
        String s2 = sc.nextLine();

        System.out.println("Merged string: \"" + merge(s1, s2) + "\"");
        sc.close();
    }
}
