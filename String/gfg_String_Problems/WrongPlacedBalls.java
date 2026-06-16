import java.util.Scanner;

class WrongPlacedBalls {
    public int countWrongPlacedBalls(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int j = i + 1;
            if ((j % 2 == 0 && c == 'R') || (j % 2 != 0 && c == 'B')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of 'R' and 'B' characters:");
        System.out.println("(Odd positions should have 'R', even positions should have 'B')");
        String s = sc.nextLine();
          WrongPlacedBalls sol = new WrongPlacedBalls();
        int result = sol.countWrongPlacedBalls(s);
        System.out.println("Number of wrongly placed balls: " + result);
        sc.close();
    }
}
