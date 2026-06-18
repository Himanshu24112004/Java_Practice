package String.String_Method;

public class trimMethod2 {
    public static void main(String[] args) {
        String userName = "   admin  ";
        String cleanName = userName.trim();

        if(cleanName.equals("admin")) {
            System.out.println("Welcome, admin!");
        } else {
            System.out.println("Access denied.");
        }
    }
}
