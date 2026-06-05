import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetCount {

    static int getCount(String s, int k) {
        if (s == null || s.isEmpty()) return 0;
        Map<Character, Integer> map = new HashMap<>();
        char cur = s.charAt(0);
        map.put(cur, 1);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != cur) { map.put(c, map.getOrDefault(c, 0) + 1); cur = c; }
        }
        int result = 0;
        for (int val : map.values()) { if (val == k) result++; }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter value of k (exact group count): ");
        int k = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Characters with exactly " + k + " group occurrence(s): " + getCount(s, k));
        sc.close();
    }
}
