import java.util.Scanner;

public class KeypadNumbers {

    static String[] keypad = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static String printNumber(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            for (int i = 2; i <= 9; i++) {
                if (keypad[i].indexOf(c) != -1) { sb.append(i); break; }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase word (e.g. hello): ");
        String s = sc.nextLine();

        System.out.println("Keypad digits for \"" + s + "\": " + printNumber(s));
        sc.close();
    }
}
