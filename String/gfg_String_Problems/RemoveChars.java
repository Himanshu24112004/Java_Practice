import java.util.Scanner;

public class RemoveChars {

    static String removeChars(String str1, String str2) {
        boolean[] present = new boolean[26];
        for (char c : str2.toCharArray()) present[c - 'a'] = true;

        StringBuilder sb = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (!present[c - 'a']) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source string      : ");
        String str1 = sc.nextLine();
        System.out.print("Enter chars to remove (str2) : ");
        String str2 = sc.nextLine();

        String result = removeChars(str1, str2);
        System.out.println("Result after removing characters of \"" + str2 + "\": \"" + result + "\"");
        sc.close();
    }
}
