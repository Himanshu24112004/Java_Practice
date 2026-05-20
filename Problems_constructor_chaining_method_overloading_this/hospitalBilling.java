class Hospital{
    String name;
    int days;

    Hospital(String name){
        this(name,0);
    }

    Hospital(String name ,  int days){
        this.name = name ;
        this.days = days;
    }

    double bill(double charge){
        return this.days*charge;
    }

    double bill(double charge , double medicine){
        return this.days*charge + medicine ;
    }
}

public class hospitalBilling {
    public static void main(String[] args) {
        Hospital h = new Hospital("Himanshu Kumar", 10);
        
        System.out.println(h.bill(2000, 500));
    }
}
