class Parking{
    int hours;
    Parking(int hours){
        this.hours=hours;
    }
    double fee(double rate){
        return hours*rate;
    }
    double fee(double rate , double fine){
        return this.hours*rate + fine;
    }
}
public class parkingFee {
    public static void main(String[] args) {
        Parking p = new Parking(4);

        System.out.println(p.fee(20,50));
    }
}
