import java.util.Scanner;

public class FirstAlphabet {

    static String firstAlphabet(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) sb.append(word.charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        System.out.println("First letters of each word: \"" + firstAlphabet(s) + "\"");
        sc.close();
    }
}
