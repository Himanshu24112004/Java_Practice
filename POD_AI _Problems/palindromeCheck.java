import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().replaceAll(" ","").toLowerCase();

        int left =0, right = s.length()-1;
        boolean isPalindrome =  true ;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}
