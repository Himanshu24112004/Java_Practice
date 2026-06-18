package String.String_Method;

public class isBlankMethod2 {
    public static void main(String[] args) {
        String comment = " \n  ";
        if(comment.isBlank()) {
            System.out.println("Please provide a comment. The comment is blank.");
        } else {
            System.out.println("Commented posted!!");
        }
    }
}
