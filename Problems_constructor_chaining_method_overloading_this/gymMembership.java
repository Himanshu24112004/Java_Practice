class Membership{
    String name;
    int duration;

    Membership(String name){
        this(name,1);
    }

    Membership(String name , int duration){
        this.name = name;
        this.duration = duration;
    }

    double fee(double rate){
        return this.duration*rate;
    }

    double fee(double rate, double discount){
        return this.duration*rate - discount;
    }
}
public class gymMembership {
    public static void main(String[] args) {
        Membership m = new Membership("Himanshu Kumar ", 2);

        System.out.println(m.fee(1000, 500));
    }
}
