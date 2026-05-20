class Employee{
    String name;
    double salary;

    Employee(String name){
        this(name,30000);
    }

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    double calculate(double bonus){
         return this.salary + bonus ;
    }

    double calculate(double bonus , double deduction){
        return this.salary + bonus - deduction ;
    }
}
public class employeeSalary {
    public static void main(String[] args) {
         Employee e = new Employee("Himanshu Kumar", 40000);

        System.out.println(e.calculate(5000, 2000));
    }
}
