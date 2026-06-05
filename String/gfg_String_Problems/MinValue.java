import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinValue {

    static int minValue(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) { if (f > 0) pq.add(f); }

        while (k > 0 && !pq.isEmpty()) {
            int top = pq.poll() - 1;
            if (top > 0) pq.add(top);
            k--;
        }

        int result = 0;
        while (!pq.isEmpty()) { int f = pq.poll(); result += f * f; }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String s = sc.nextLine();
        System.out.print("Enter number of characters to remove (k): ");
        int k = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Minimum sum of squares of frequencies after removing " + k + " chars: " + minValue(s, k));
        sc.close();
    }
}
