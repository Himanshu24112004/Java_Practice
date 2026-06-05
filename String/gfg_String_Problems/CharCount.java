import java.util.Scanner;

public class CharCount {

    static int[] count(String s) {
        int upper = 0, lower = 0, digit = 0, spec = 0;
        for (char c : s.toCharArray()) {
            if      (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
            else if (Character.isDigit(c))     digit++;
            else                               spec++;
        }
        return new int[]{upper, lower, digit, spec};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int[] result = count(s);
        System.out.println("--- Character Count ---");
        System.out.println("Uppercase letters : " + result[0]);
        System.out.println("Lowercase letters : " + result[1]);
        System.out.println("Digits            : " + result[2]);
        System.out.println("Special characters: " + result[3]);
        sc.close();
    }
}
