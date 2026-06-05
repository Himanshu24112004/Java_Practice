import java.util.Arrays;
import java.util.Scanner;

public class SolveRPS {

    static int[] solveRPS(String a, String b, int k) {
        int n = a.length(), m = b.length();
        long lcm = lcm(n, m);
        int[] cycleWins = simulate(a, b, (int) lcm);
        long fullCycles = k / lcm;
        long remainder  = k % lcm;
        int[] total = {(int)(cycleWins[0] * fullCycles), (int)(cycleWins[1] * fullCycles)};
        int[] remWins = simulate(a, b, (int) remainder);
        total[0] += remWins[0]; total[1] += remWins[1];
        return total;
    }

    private static int[] simulate(String a, String b, int k) {
        int n = a.length(), m = b.length(), wA = 0, wB = 0;
        for (int i = 0; i < k; i++) {
            char mA = a.charAt(i % n), mB = b.charAt(i % m);
            if (mA == mB) continue;
            if (wins(mA, mB)) wA++; else wB++;
        }
        return new int[]{wA, wB};
    }

    private static boolean wins(char x, char y) {
        return (x=='R'&&y=='S') || (x=='S'&&y=='P') || (x=='P'&&y=='R');
    }

    private static long lcm(int a, int b) { return (long) a * b / gcd(a, b); }
    private static int  gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player A's move sequence (R/P/S, e.g. RPS): ");
        String a = sc.nextLine().trim().toUpperCase();
        System.out.print("Enter Player B's move sequence (R/P/S, e.g. SRP): ");
        String b = sc.nextLine().trim().toUpperCase();
        System.out.print("Enter number of rounds (k): ");
        int k = Integer.parseInt(sc.nextLine().trim());

        int[] result = solveRPS(a, b, k);
        System.out.println("--- Results after " + k + " rounds ---");
        System.out.println("Player A wins: " + result[0]);
        System.out.println("Player B wins: " + result[1]);
        System.out.println("Draws        : " + (k - result[0] - result[1]));
        sc.close();
    }
}
