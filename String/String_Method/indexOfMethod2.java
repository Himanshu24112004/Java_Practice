package String.String_Method;

public class indexOfMethod2 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        int indexOfSpace = text.indexOf(" ");
        if(indexOfSpace != -1) {
            System.out.println("First space found at index: " + indexOfSpace);
        } else {
            System.out.println("No space found in the text.");
        }
    }
}
