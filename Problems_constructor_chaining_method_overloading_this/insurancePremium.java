class Insurance{
    double amount;
    Insurance(double amount){
        this.amount=amount;
    }
    double premium(double rate){
        return this.amount*rate;
    }
    double premium(double rate, double charge){
        return this.amount*rate + charge;
    }
}
public class insurancePremium {
    public static void main(String[] args) {
        Insurance i = new Insurance(100000);
        System.out.println(i.premium(0.05, 2000));
    }
}
