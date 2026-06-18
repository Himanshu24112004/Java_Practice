class Person{
    String firstName;
    String lastName;
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
}
class Employee extends Person{
    int empId;
    String empDesignation;
    Employee(String firstName, String lastName, int empId, String empDesignation){
        super(firstName, lastName);
        this.empId = empId;
        this.empDesignation = empDesignation;
    }
    int getEmpId(){
        return empId;
    }
    String getLastName(){
        return lastName+" "+empDesignation;
    }
}
public class poly9 {
    public static void main(String[] args) {
        Person p = new Person("John", "Doe");
        System.out.println("First Name : "+p.getFirstName());
        System.out.println("Last Name : "+p.getLastName());

        Employee e = new Employee("Jane", "Smith", 101, "Manager");
        System.out.println("First Name : "+e.getFirstName());
        System.out.println("Last Name : "+e.getLastName());
        System.out.println("Employee ID : "+e.getEmpId());
    }
}
