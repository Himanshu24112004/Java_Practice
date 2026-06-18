package String.String_Method;

public class startsWithMethod1 {
    public static void main(String[] args) {
        String str = "https://www.example.com";
        System.out.println(str.startsWith("https://")); // Output: true
        System.out.println(str.startsWith("http://")); // Output: false
    }    
}
