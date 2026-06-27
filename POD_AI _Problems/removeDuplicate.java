import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(seen.add(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

        sc.close();
    }
}
