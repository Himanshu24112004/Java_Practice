import java.util.Arrays;
import java.util.Scanner;

public class ReverseSort {

    static String reverseSort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l < r) {
            char temp = arr[l]; arr[l] = arr[r]; arr[r] = temp;
            l++; r--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to sort in reverse order: ");
        String s = sc.nextLine();

        System.out.println("Original      : \"" + s + "\"");
        System.out.println("Reverse sorted: \"" + reverseSort(s) + "\"");
        sc.close();
    }
}
