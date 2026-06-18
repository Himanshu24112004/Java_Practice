package String.String_Method;

public class indexOfMethod1 {
    public static void main(String[] args) {
        String str = "Hello Java World";
        System.out.println("Index of 'Java': " + str.indexOf("Java")); // Output: 6
        System.out.println("Index of 'World': " + str.indexOf("z")); // Output: -1 (not found)
        System.out.println("Index of 'o': " + str.indexOf('o')); // Output: 4 (first occurrence of 'o')
    }
}
