class Employee{
    String name;
    double salary;

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
public class employeeSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name ="Himanshu Kumar";
        e1.salary=100000;
        e1.display();
    }
}
