import java.util.Scanner;

public class CountCamelCase {

    static int countCamelCase(String s) {
        int count = 0;
        for (char c : s.toCharArray()) { if (Character.isUpperCase(c)) count++; }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a camelCase string: ");
        String s = sc.nextLine();

        int words = countCamelCase(s);
        System.out.println("Number of words in \"" + s + "\": " + (words + 1));
        // +1 because the first word has no uppercase prefix
        sc.close();
    }
}
