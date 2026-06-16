import java.util.Scanner;

class IsPossible {
    static int isPossible(String S) {
        int n = S.length();
        if (n < 4) return 0;

        for (int i = 1; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                for (int k = j + 1; k <= n - 1; k++) {
                    String s1 = S.substring(0, i);
                    String s2 = S.substring(i, j);
                    String s3 = S.substring(j, k);
                    String s4 = S.substring(k, n);

                    if (!s1.equals(s2) && !s1.equals(s3) && !s1.equals(s4) &&
                        !s2.equals(s3) && !s2.equals(s4) &&
                        !s3.equals(s4)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it can be split into 4 distinct parts: ");
        String S = sc.nextLine();
        int result = isPossible(S);
        System.out.println("Is it possible to split into 4 distinct parts? " + (result == 1 ? "Yes (1)" : "No (0)"));
        sc.close();
    }
}
