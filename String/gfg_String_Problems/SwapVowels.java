import java.util.Scanner;

public class SwapVowels {

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    static String modify(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && !isVowel(arr[l])) l++;
            while (l < r && !isVowel(arr[r])) r--;
            if (l < r) {
                char temp = arr[l]; arr[l] = arr[r]; arr[r] = temp;
                l++; r--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to swap its vowels: ");
        String s = sc.nextLine();

        System.out.println("Original      : \"" + s + "\"");
        System.out.println("After swapping: \"" + modify(s) + "\"");
        sc.close();
    }
}
