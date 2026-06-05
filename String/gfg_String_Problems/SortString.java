import java.util.Arrays;
import java.util.Scanner;

public class SortString {

    static String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String s = sc.nextLine();

        System.out.println("Original: \"" + s + "\"");
        System.out.println("Sorted  : \"" + sortString(s) + "\"");
        sc.close();
    }
}
