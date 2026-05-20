class Electricity{
    int units;

    Electricity(int  units){
        this.units=units;
    }

    double bill(double rate){
        return this.units*rate;
    }

    double bill(double rate , double surcharge){
        return this.units*rate + surcharge;
    }
}
public class electricityBill {
    public static void main(String[] args) {
        Electricity e  = new Electricity(100);
        System.out.println(e.bill(5, 50));
    }
}
