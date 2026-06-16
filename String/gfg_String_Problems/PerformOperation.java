import java.util.Scanner;

class PerformOperation {
    static long performOperation(long N) {
        String s = String.valueOf(N);
        long maxNum = Long.parseLong(s.replace('5', '6'));
        long minNum = Long.parseLong(s.replace('6', '5'));
        return maxNum + minNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N (replace 5->6 for max, 6->5 for min, return their sum): ");
        long N = sc.nextLong();
        long result = performOperation(N);
        System.out.println("Sum of max and min numbers: " + result);
        sc.close();
    }
}
