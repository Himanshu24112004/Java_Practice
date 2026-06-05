import java.util.Scanner;

public class ReverseWithSpaces {

    static String reverseWithSpacesIntact(String S) {
        char[] arr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) { if (c != ' ') sb.append(c); }
        String rev = sb.reverse().toString();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') arr[i] = rev.charAt(j++);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (spaces will stay in place): ");
        String s = sc.nextLine();

        System.out.println("Original : \"" + s + "\"");
        System.out.println("Reversed : \"" + reverseWithSpacesIntact(s) + "\"");
        sc.close();
    }
}
