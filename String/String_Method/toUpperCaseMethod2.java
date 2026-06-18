public class toUpperCaseMethod2 {
    public static void main(String[] args) {
        String userCode = "save20";
        String validCode = "SAVE20";

        if(userCode.toUpperCase().equals(validCode)) {
            System.out.println("The user code is valid.");
        } else {
            System.out.println("The user code is invalid.");
        }
    }
}