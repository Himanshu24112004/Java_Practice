import java.util.Scanner;

class FindDiff {
    long findDiff(long amount) {
        String s = String.valueOf(amount);
        String confused = s.replace('6', '9');
        long maxAmount = Long.parseLong(confused);
        return maxAmount - amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (to replace 6s with 9s and find the difference): ");
        long amount = sc.nextLong();
          FindDiff sol = new FindDiff();
        long result = sol.findDiff(amount);
        System.out.println("Difference after replacing 6 with 9: " + result);
        sc.close();
    }
}
