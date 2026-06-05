import java.util.Scanner;

public class IsSquare {

    static int isSquare(String S) {
        int sum = 0;
        for (char c : S.toCharArray()) sum += c;
        int sq = (int) Math.sqrt(sum);
        return (sq * sq == sum) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int sum = 0;
        for (char c : s.toCharArray()) sum += c;

        if (isSquare(s) == 1)
            System.out.println("Sum of ASCII values = " + sum + " → Perfect square! ✓");
        else
            System.out.println("Sum of ASCII values = " + sum + " → NOT a perfect square. ✗");

        sc.close();
    }
}
