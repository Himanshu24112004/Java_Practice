package String.String_Method;

public class containsMethod2 {
    public static void main(String[] args) {
        String email = "user@gmail.com";
        if(email.contains("@") && email.contains(".")) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address. Missing '@' symbol.");
        }
    }
}
