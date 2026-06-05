import java.util.Scanner;

public class CountWords {

    static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        System.out.println("Word count: " + countWords(s));
        sc.close();
    }
}
