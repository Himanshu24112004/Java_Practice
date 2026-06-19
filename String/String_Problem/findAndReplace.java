public class findAndReplace {
    public static void main(String[] args) {
        String text = "I love Java.Java ix Great!";

        System.out.println(text.replaceFirst("Java","Python")); 
        
        System.out.println(text.replace("Java","Python"));

        System.out.println(text.replace('a','@'));

        System.out.println("Contains Love : "+text.contains("love"));
    }
}
