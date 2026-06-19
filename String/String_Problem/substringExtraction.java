public class substringExtraction {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text.indexOf(6));
        System.out.println(text.indexOf(0, 5));
        
        String email = "user@gmail.com";
        int atIndex = email.indexOf('@');
        System.out.println(email.substring(atIndex+1));
    }
}
