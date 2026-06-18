package String.String_Method;

public class charAtMethod2 {
    public static void main(String[] args) {
        String word = "radar";
        if(word.charAt(0)==word.charAt(word.length()-1)){
            System.out.println("First and last character match!");
        }
    }
}
