import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name,  int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int rollNumber;

    Student(String name, int age, int rollNumber){
            super(name, age);
            this.rollNumber = rollNumber;
    }
}
class SportStudent extends Student{
    String sportName;

    SportStudent(String name, int age, int rollNumber,String sportName){
        super(name, age, rollNumber);
        this.sportName = sportName;
    }
}
public class multiLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name  = sc.nextLine();
        int age = sc.nextInt();
        int rollNumber = sc.nextInt();
        sc.nextLine();
        String sportName = sc.nextLine();

        SportStudent ss = new SportStudent(name, age, rollNumber, sportName);
        System.out.println("Name: "+ss.name);
        System.out.println("Age: "+ss.age);
        System.out.println("Roll Number: "+ss.rollNumber);
        System.out.println("Sport: "+ss.sportName);

        sc.close();
    }
}
