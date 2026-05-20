class Courier{
    double weight ;
    Courier(double weight){
        this.weight= weight;
    }
    double charge(double rate){
        return weight*rate;
    }
    double charge(double rate , double extra){
        return weight*rate + extra;
    }
}
public class courierCharge {
    public static void main(String[] args) {
       Courier c = new Courier(5);
       System.out.println(c.charge(50, 100)); 
    }
}
