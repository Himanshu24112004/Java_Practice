class Employee{
    double calculateSalary(){
        return 0;
    }
}
    class Manager extends Employee{
        @Override
        double calculateSalary(){
            return 80000;
        }
    }
    class Programmer extends Employee{
        @Override
        double calculateSalary(){
            return 60000;
        }
    }

public class poly4 {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Programmer();

        System.out.println("Manager Salary : "+e1.calculateSalary());
        System.out.println("Programmer Salary : "+e2.calculateSalary());
    }
}
