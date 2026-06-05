import java.util.Scanner;

public class LastIndex {

    static int lastIndex(String s) {
        return s.lastIndexOf('1');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String s = sc.nextLine();

        int idx = lastIndex(s);
        if (idx == -1)
            System.out.println("No '1' found in the string.");
        else
            System.out.println("Last occurrence of '1' is at index: " + idx);

        sc.close();
    }
}
