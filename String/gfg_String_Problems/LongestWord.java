import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWord {

    static String longest(List<String> arr) {
        String maxWord = arr.get(0);
        for (String word : arr) {
            if (word.length() > maxWord.length()) maxWord = word;
        }
        return maxWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many words do you want to enter? ");
        int n = Integer.parseInt(sc.nextLine().trim());

        List<String> words = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("  Word " + i + ": ");
            words.add(sc.nextLine().trim());
        }

        System.out.println("Longest word: \"" + longest(words) + "\"");
        sc.close();
    }
}
