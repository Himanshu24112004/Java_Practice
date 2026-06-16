import java.util.Scanner;

class ConRevStr {
    static String conRevstr(String s1, String s2) {
        return new StringBuilder(s1 + s2).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        String result = conRevstr(s1, s2);
        System.out.println("Concatenated and reversed: " + result);
        sc.close();
    }
}
