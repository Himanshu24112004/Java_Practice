class Student{
    String name;
    int marks;

    Student(String name){
        this(name , 0);
    }

    Student(String name, int marks){
        this.name = name ;
        this.marks = marks;
    }

    void updateMarks(int marks){
        this.marks = marks;
    }

    void updateMarks(int marks , int grace){
        this.marks = marks + grace;
    }

    void display(){
        System.out.println(this.name +" scored "+this.marks);
    }
}
public class studentResultProcess {
    public static void main(String[] args) {
        Student s = new Student("Aman");
        s.updateMarks(70,5);
        s.display();
    }
}
