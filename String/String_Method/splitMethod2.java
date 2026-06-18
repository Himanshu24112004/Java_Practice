package String.String_Method;

public class splitMethod2 {
    public static void main(String[] args) {
        String data = "john,25,Engineering,New York";
        String[] fields = data.split(",");

        System.out.println("Name: "+fields[0]);
        System.out.println("Age: "+fields[1]);
        System.out.println("Job: "+fields[2]);
        System.out.println("City: "+fields[3]);
    }
}
