import java.util.Scanner;

public class CompareNumbers {

    static int check(String a, String b) {
        a = a.replaceFirst("^0+", ""); b = b.replaceFirst("^0+", "");
        if (a.isEmpty()) a = "0";
        if (b.isEmpty()) b = "0";
        if (a.length() > b.length()) return 2;
        if (a.length() < b.length()) return 1;
        int cmp = a.compareTo(b);
        return cmp > 0 ? 2 : cmp < 0 ? 1 : 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number  (A): ");
        String a = sc.nextLine().trim();
        System.out.print("Enter second number (B): ");
        String b = sc.nextLine().trim();

        int result = check(a, b);
        if      (result == 1) System.out.println("B (" + b + ") is greater.");
        else if (result == 2) System.out.println("A (" + a + ") is greater.");
        else                  System.out.println("Both numbers are equal.");

        sc.close();
    }
}
