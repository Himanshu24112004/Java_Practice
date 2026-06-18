package String.String_Method;

public class lastIndexOfMethod2 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        int dotIndex = fileName.lastIndexOf(".");
        if(dotIndex > 0) {
            String extension = fileName.substring(dotIndex + 1);
            System.out.println("File extension: " + extension); // Output: txt
        } else {
            System.out.println("No file extension found.");
        }
    }
}
