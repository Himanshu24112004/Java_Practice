package String.String_Method;

public class lengthMethod2 {
    public static void main(String[] args) {
        String password = "SecurePass123!";
        if(password.length() < 8) {
            System.out.println("Password is too short. It must be at least 8 characters long.");
        } else {
            System.out.println("Password length is sufficient.");
        }
    }    
}
