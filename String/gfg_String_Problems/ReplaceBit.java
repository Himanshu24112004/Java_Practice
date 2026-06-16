import java.util.Scanner;

class ReplaceBit {
    static int replaceBit(int N, int K) {
        int len = Integer.toBinaryString(N).length();

        if (K > len) return N;

        int posFromRight = len - K;
        int mask = 1 << posFromRight;

        if ((N & mask) != 0) {
            N = N & ~mask;
        }

        return N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int N = sc.nextInt();
        System.out.print("Enter bit position K (1-based from left) to clear: ");
        int K = sc.nextInt();
        System.out.println("Binary of N: " + Integer.toBinaryString(N));
        int result = replaceBit(N, K);
        System.out.println("After clearing bit at position " + K + ": " + result);
        System.out.println("Binary result: " + Integer.toBinaryString(result));
        sc.close();
    }
}
