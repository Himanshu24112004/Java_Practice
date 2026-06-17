abstarct class Employee {
    protected String name;
    protected int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    abstract void displayDetails();
}
class Manager extends Employee {
    private double baseSalary;
    private int teamSize;
    Manager(String name, int id, double baseSalary, int teamSize) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.teamSize = teamSize;
    }
    double calculateSalary() {
        return baseSalary + (teamSize * 500); // Bonus for team size
    }
    void displayDetails() {
        System.out.println("---Manager Details---");
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("Team : " + teamSize + " members");
        System.out.printf("Salary: %.2f%n", calculateSalary());
    }
}
class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    Programmer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    void displayDetails() {
        System.out.println("---Programmer Details---");
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("Hours Worked : " + hoursWorked);
        System.out.printf("Salary: %.2f%n", calculateSalary());
    }
}
public class abstract5 {
    public static void main(String[] args) {
        Employee mgr = new Manager("Ravi", 101, 50000, 5);
        Employee prg = new Programmer("Anita", 102, 500, 160);
        mgr.displayDetails();
        prg.displayDetails();
    }
}
