package String.String_Method;

public class equalsMethod2 {
    public static void main(String[] args) {
        String storedPassword = "Secret@123";
        String enteredPassword = "Secret@123";
        if(storedPassword.equals(enteredPassword)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied. Incorrect password.");
        }
    }
}
