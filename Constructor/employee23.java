class  Employee{
    String name ;
    int salary;
    
    Employee(String n, int s){
        name = n;
        salary = s;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
public class employee23 {
    public static void main(String[] args) {
        Employee e = new Employee("Himanshu Kumar", 500000000);
        e.display();
    }
}
