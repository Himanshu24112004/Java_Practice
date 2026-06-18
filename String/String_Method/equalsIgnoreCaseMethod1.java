package String.String_Method;

public class equalsIgnoreCaseMethod1 {
    public static void main(String[] args) {
        String s1 = "Java Programming";
        String s2 = "java programming";
        System.out.println(s1.equals(s2)); // false (case sensitive)
        System.out.println(s1.equalsIgnoreCase(s2)); // true (ignores case)
    }
}
