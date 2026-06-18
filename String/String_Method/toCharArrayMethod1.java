package String.String_Method;

public class toCharArrayMethod1 {
    public static void main(String[] args) {
        String word = "Java";
        char[] letters = word.toCharArray();
        for(char c : letters){
            System.out.println(c);
        }
    }
}
