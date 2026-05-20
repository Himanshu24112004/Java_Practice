class Course{
    String title;
    int duration;

    Course(String title){
        this(title,0);
    }

    Course(String title , int duration ){
        this.title = title;
        this.duration = duration;
    }

    double price(double rate){
        return this.duration*rate;
    }

    double price(double rate , double offer){
        return this.duration*rate - offer ;
    }
}
public class onlineCourse {
    public static void main(String[] args) {
        Course c = new Course("THE JUNGLE BOOK", 20);

        System.out.println(c.price(500, 1000));
    }
}
