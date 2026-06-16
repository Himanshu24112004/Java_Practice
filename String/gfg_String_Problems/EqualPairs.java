import java.util.Scanner;

class EqualPairs {
    long equalPairs(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        long count = 0;
        for (int f : freq) {
            if (f > 0) {
                count += (long) f * f;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count equal pairs: ");
        String s = sc.nextLine();
          EqualPairs sol = new EqualPairs();
        long result = sol.equalPairs(s);
        System.out.println("Number of equal ordered pairs: " + result);
        sc.close();
    }
}
