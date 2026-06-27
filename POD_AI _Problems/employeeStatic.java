import java.util.*;

class Employee{
    static String companyName = "ABC Corp";
    static int counter = 0;
    String name ;
    String id;

    Employee(String name){
        this.name= name;
        this.id = "EMP"+(++counter);
    }
    void print(){
        System.out.println("ID: "+id+", Name: "+name+", Company: "+companyName);
    }
}
public class employeeStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Employee[] employees =  new Employee[n];

        for(int i=0; i<n; i++){
            employees[i] = new Employee(sc.nextLine());
        }

        for(Employee e : employees){
            e.print();
        }
        System.out.println("Total Employees: "+n);

        sc.close();
    }
}
