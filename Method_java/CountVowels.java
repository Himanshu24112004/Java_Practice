import java.util.Scanner;

public class CountVowels {
    public static void Count(String s){
        int count=0;
        for(int i=0; i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
        }
         System.out.println("Number of Vowel : "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
            Count(str);
            sc.close();
    }
}
