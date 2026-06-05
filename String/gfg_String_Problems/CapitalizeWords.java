import java.util.Scanner;

public class CapitalizeWords {

    static String convert(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.isEmpty()) continue;
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            sb.append(' ');
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        System.out.println("Original   : \"" + s + "\"");
        System.out.println("Capitalized: \"" + convert(s) + "\"");
        sc.close();
    }
}
