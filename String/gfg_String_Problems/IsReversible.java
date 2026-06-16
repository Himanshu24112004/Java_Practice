import java.util.Scanner;

class IsReversible {
    public int isReversible(String str, int n) {
        int i = 0, j = n - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return 0;
            }
            i++;
            j--;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();
          IsReversible sol = new IsReversible();
        int result = sol.isReversible(str, n);
        System.out.println("Is \"" + str + "\" reversible (palindrome)? " + (result == 1 ? "Yes (1)" : "No (0)"));
        sc.close();
    }
}
