import java.util.Scanner;

class AllSameChars {
    Boolean check(String s) {
        if (s.length() == 0) {
            return true;
        }
        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != first) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if all characters are the same: ");
        String s = sc.nextLine();
          AllSameChars sol = new AllSameChars();
        Boolean result = sol.check(s);
        System.out.println("Are all characters the same in \"" + s + "\"? " + result);
        sc.close();
    }
}
