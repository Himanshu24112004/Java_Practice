import java.util.ArrayList;
import java.util.Scanner;

public class PrefixPattern {

    static ArrayList<String> pattern(String s) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = s.length(); i > 0; i--) result.add(s.substring(0, i));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        ArrayList<String> result = pattern(s);
        System.out.println("Prefix pattern (decreasing):");
        for (String prefix : result) System.out.println("  " + prefix);
        sc.close();
    }
}
