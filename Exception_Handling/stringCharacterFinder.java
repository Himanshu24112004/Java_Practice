import java.util.Scanner;

public class stringCharacterFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try{
         String inputString = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(inputString.charAt(k));
       } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        }catch (Exception e) {
            System.out.println("Error: Please enter valid input.");
        }
        sc.close();
    }
}
