class Student{
    String name ;
    int Roll ;
    int marks;

    Student(String n, int r, int m){
        name = n;
        Roll = r;
        marks = m;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll no. : "+Roll);
        System.out.println("Marks : "+marks);
    }
}
public class Student23 {
    public static void main(String[] args) {
        Student s = new Student("Himanshu Kumar", 10585, 485);
        s.display();
    }
}
