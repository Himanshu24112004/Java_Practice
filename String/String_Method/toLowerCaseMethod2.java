package String.String_Method;

public class toLowerCaseMethod2 {
    public static void main(String[] args) {
        String data = "Java Programming Language";
        String search = "programming";
        if(data.toLowerCase().contains(search.toLowerCase())) {
            System.out.println("The string contains the word: " + search);
        } else {
            System.out.println("The string does not contain the word: " + search);
        }
    }
}
