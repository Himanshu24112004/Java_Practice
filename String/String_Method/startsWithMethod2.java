package String.String_Method;

public class startsWithMethod2 {
    public static void main(String[] args) {
        String phone = "+91-9876543210";
        if(phone.startsWith("+91")){
            System.out.println("This is an Indian phone number.");
        } else {
            System.out.println("This is not an Indian phone number.");
        }
    }
}
