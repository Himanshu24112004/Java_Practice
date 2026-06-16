import java.util.Scanner;

class TransformString {
    String transformString(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                char mapped = (char) ('z' - (c - 'a'));
                result.append(mapped);
            } else if (Character.isUpperCase(c)) {
                char mapped = (char) ('Z' - (c - 'A'));
                result.append(mapped);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to transform (mirror alphabet, a<->z, b<->y ...): ");
        String s = sc.nextLine();
          TransformString sol = new TransformString();
        String result = sol.transformString(s);
        System.out.println("Transformed string: " + result);
        sc.close();
    }
}
