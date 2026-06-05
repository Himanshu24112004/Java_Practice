import java.util.Scanner;

public class DelAlternate {

    static String delAlternate(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Original                       : \"" + s + "\"");
        System.out.println("After deleting alternate chars : \"" + delAlternate(s) + "\"");
        sc.close();
    }
}
