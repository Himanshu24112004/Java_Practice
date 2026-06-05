import java.util.Scanner;

public class RemoveVowels {

    static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Original            : \"" + s + "\"");
        System.out.println("After removing vowels: \"" + removeVowels(s) + "\"");
        sc.close();
    }
}
