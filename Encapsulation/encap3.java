class Employee{
    private String employee_id;
    private String employee_name;
    private double employee_salary;

    Employee(double employee_salary){
        this.employee_salary=employee_salary;
    }

    public void setId(String employee_id){
        this.employee_id=employee_id;
    }

    public void setName(String employee_name){
        this.employee_name=employee_name;
    }


    public String getId(){
        return employee_id;
    }
    public String getName(){
        return employee_name;
    }

    public double getSalary(){
        return employee_salary;
    }
}
public class encap3 {
    public static void main(String[] args) {
        Employee e = new Employee(133223);
        e.setId("45666");
        e.setName("Himanshu");
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
