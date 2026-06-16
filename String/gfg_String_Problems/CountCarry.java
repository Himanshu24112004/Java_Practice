import java.util.Scanner;

class CountCarry {
    static int countCarry(Long A, Long B) {
        int carryCount = 0;
        int carry = 0;

        while (A > 0 || B > 0) {
            long digitA = A % 10;
            long digitB = B % 10;

            long sum = digitA + digitB + carry;

            if (sum >= 10) {
                carryCount++;
                carry = 1;
            } else {
                carry = 0;
            }

            A /= 10;
            B /= 10;
        }

        return carryCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number A: ");
        Long A = sc.nextLong();
        System.out.print("Enter second number B: ");
        Long B = sc.nextLong();
        int result = countCarry(A, B);
        System.out.println("Number of carry operations when adding " + A + " + " + B + ": " + result);
        sc.close();
    }
}
