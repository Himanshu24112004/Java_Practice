import java.util.Arrays;
import java.util.Scanner;

public class RepeatedCharacter {

    static int repeatedCharacter(String S) {
        int[] firstIndex = new int[256];
        Arrays.fill(firstIndex, -1);
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (firstIndex[c] == -1) firstIndex[c] = i;
            else answer = Math.min(answer, firstIndex[c]);
        }
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int idx = repeatedCharacter(s);
        if (idx == -1)
            System.out.println("No repeated character found.");
        else
            System.out.println("First repeated character '" + s.charAt(idx) + "' first appeared at index: " + idx);

        sc.close();
    }
}
