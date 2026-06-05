import java.util.Scanner;

public class CheckDuck {

    static boolean checkDuck(String num) {
        if (num.charAt(0) == '0') return false;
        return num.indexOf('0') != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (as string): ");
        String num = sc.nextLine().trim();

        if (checkDuck(num))
            System.out.println("\"" + num + "\" IS a Duck Number.");
        else
            System.out.println("\"" + num + "\" is NOT a Duck Number.");

        sc.close();
    }
}
