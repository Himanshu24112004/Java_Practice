import java.util.Scanner;

class StringExist {
    static String isStringExist(String arr[], int N, String S) {
        for (int i = 0; i < N; i++) {
            String word = arr[i];

            if (word.length() == S.length()) {
                int diffCount = 0;

                for (int j = 0; j < S.length(); j++) {
                    if (S.charAt(j) != word.charAt(j)) {
                        diffCount++;
                        if (diffCount > 1) break;
                    }
                }

                if (diffCount == 1) {
                    return "True";
                }
            }
        }
        return "False";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings in array: ");
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[N];
        System.out.println("Enter " + N + " strings:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.print("Enter target string S: ");
        String S = sc.nextLine();
        System.out.println("Result: " + isStringExist(arr, N, S));
        sc.close();
    }
}
