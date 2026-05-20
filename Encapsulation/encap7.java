import java.util.ArrayList;

class Student{
    private String st_id;
    private String st_name;
    private ArrayList<Integer> grade = new ArrayList<>();

    public void setSt_id(String st_id){
        this.st_id = st_id;
    }

    public void setSt_name(String st_name){
        this.st_name = st_name;
    }

    public String getSt_id(){
        return st_id;
    }

    public String getSt_name(){
        return st_name;
    }

    public void addGrade(int grade){
        if(grade>=0 && grade<=100){
            grade.add(grade);
            System.out.println("Grade added successfully");
        }
        else{
            System.out.println("invalid grade!!");
        }
    }

    public void displayGrade(){
        System.out.println(grade);
    }
}
public class encap7 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSt_id("10585");
        s.setSt_name("Himanshu Kumar");
        s.addGrade(85);
        System.out.println(s.getSt_id());
        System.out.println(s.getSt_name());
        s.displayGrade();
    }
}
