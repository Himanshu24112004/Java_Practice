import java.util.Scanner;

public class StrongPasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Password :");
        String pass = sc.nextLine();

        if(pass.length()>=8 &&
         pass.matches(".*[a-z].*") &&
          pass.matches(".*[A-Z].*")&&
           pass.matches(".*[0-9].*")){
            System.out.println("Strong Password");
           }
           else{
            System.out.println("Weak Password");
           }
           sc.close();
    } 
}


public class StrongPasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Password :");
        String pass = sc.nextLine();
        
        if(pass.length()>=8 &&
         pass.matches(".*[a-z].*") &&
          pass.matches(".*[A-Z].*")&&
           pass.matches(".*[0-9].*")){
            System.out.println("Strong Password");
           }
           else{
            System.out.println("Weak Password");
           }
           sc.close();
    } 
}


public class StrongPasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Password :");
        String pass = sc.nextLine();
        
        if(pass.length()>=8 &&
         pass.matches(".*[a-z].*") &&
          pass.matches(".*[A-Z].*")&&
           pass.matches(".*[0-9].*")){
            System.out.println("Strong Password");
           }
           else{
            System.out.println("Weak Password");
           }
           sc.close();
    } 
}
