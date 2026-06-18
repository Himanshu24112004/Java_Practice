package String.String_Method;

public class splitMethod1 {
    public static void main(String[] args) {
        String sentence = "Java is Awsome";
        String[] words = sentence.split(" ");

        for(String word : words){
            System.out.println(word);
        }
    }
}
