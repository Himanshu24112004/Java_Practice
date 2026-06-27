import java.util.Scanner;

class Employee{
    String name ;
    String employeeId;

    Employee(String name, String employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
}
class Teacher extends Employee{
    Teacher(String name, String employeeId){
        super(name, employeeId);
    }
}
class Clerk extends Teacher{
    Clerk(String name, String employeeId){
        super(name,employeeId);
    }
}
public class emlpoyeeHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String employeeId = sc.nextLine();

        Teacher t = new Teacher(name, employeeId);
        Clerk c = new Clerk(name, employeeId);

        System.out.println("Teacher Details:");
        System.out.println("Name: "+t.name);
        System.out.println("Employee ID: "+t.employeeId);
        System.out.println("Cleck Details:");
        System.out.println("Name: "+c.name);
        System.out.println("Employee ID: "+c.employeeId);

        sc.close();
    }
}
