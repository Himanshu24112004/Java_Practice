package String.String_Method;

public class endsWithMethod2 {
    public static void main(String[] args) {
        String file = {"report.docx", "presentation.pptx", "image.jpeg", "archive.zip"};
        for(String f : file) {
            if(f.endsWith(".docx")) {
                System.out.println(f + " is a Word document.");
            } else if(f.endsWith(".pptx")) {
                System.out.println(f + " is a PowerPoint presentation.");
            } else if(f.endsWith(".jpeg")) {
                System.out.println(f + " is an image file.");
            } else if(f.endsWith(".zip")) {
                System.out.println(f + " is a compressed archive.");
            } else {
                System.out.println(f + " has an unknown file type.");
            }
        }
}
