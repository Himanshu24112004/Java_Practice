package String.String_Method;

public class containsMethod1 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        System.out.println(sentence.contains("powerful"));
        System.out.println(sentence.contains("Python")); // false, not present in the sentence
    }
}
