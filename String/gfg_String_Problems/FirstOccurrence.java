import java.util.Scanner;

public class FirstOccurrence {

    static int firstOccurrence(String txt, String pat) {
        return txt.indexOf(pat);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main text  : ");
        String txt = sc.nextLine();
        System.out.print("Enter pattern to find: ");
        String pat = sc.nextLine();

        int index = firstOccurrence(txt, pat);
        if (index == -1)
            System.out.println("Pattern \"" + pat + "\" not found in text.");
        else
            System.out.println("First occurrence of \"" + pat + "\" is at index: " + index);

        sc.close();
    }
}
