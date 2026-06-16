import java.util.Scanner;

class ExtractMessage {
    String ExtractMessage(String S) {
        String result = S.replace("LIE", " ");
        result = result.trim().replaceAll("\\s+", " ");
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encoded string (contains 'LIE' as separators): ");
        String S = sc.nextLine();
          ExtractMessage sol = new ExtractMessage();
        String result = sol.ExtractMessage(S);
        System.out.println("Extracted message: " + result);
        sc.close();
    }
}
