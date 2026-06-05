import java.util.Scanner;

public class URLify {

    static String URLify(String s) {
        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a URL string with spaces: ");
        String s = sc.nextLine();

        System.out.println("Original  : " + s);
        System.out.println("URLified  : " + URLify(s));
        sc.close();
    }
}
