public class stringCheck {
    public static void main(String[] args) {
        String text = "Java123";

        System.out.println("Is Empty? "+text.isEmpty());
        System.out.println("Start with 'ja'? "+text.startsWith("ja"));
        System.out.println("Ends with '123' ? "+text.endsWith("123"));
        System.out.println("Index of 'v': "+text.indexOf('v'));
        System.out.println("Last index of 'a' : "+text.lastIndexOf('a'));
    }
}
