import java.util.Scanner;

public class EncryptString {

    static String encryptString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length(), i = 0;
        while (i < n) {
            char c = s.charAt(i);
            int count = 1;
            while (i + 1 < n && s.charAt(i + 1) == c) { count++; i++; }
            sb.append(c).append(count);
            i++;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to encrypt: ");
        String s = sc.nextLine();

        System.out.println("Original : \"" + s + "\"");
        System.out.println("Encrypted: \"" + encryptString(s) + "\"");
        sc.close();
    }
}
