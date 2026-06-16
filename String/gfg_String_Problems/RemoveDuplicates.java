import java.util.Scanner;

class RemoveDuplicates {
    String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to remove duplicate characters: ");
        String s = sc.nextLine();
          RemoveDuplicates sol = new RemoveDuplicates();
        String result = sol.removeDuplicates(s);
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
