import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc .nextLine();

        String[] words = s.split("\\s+");

        String longest = words[0];

        for(String word : words){
            if(word.length()> longest.length()){
                longest = word;
            }
        }
        System.out.println(longest);

        sc.close();
    }
}
