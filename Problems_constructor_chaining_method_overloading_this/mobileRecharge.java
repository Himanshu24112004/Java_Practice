class Recharge{
    String  number;
    double balance ;

    Recharge(String number){
        this(number, 0);
    }

    Recharge(String number , double balance){
        this.number = number;
        this.balance= balance;
    }

    double recharge(double amount){
        return this.balance += amount;
    }

    void recharge(double amount , double cashback){
           this.balance += amount + cashback;
    }

    void display(){
        System.out.println("Balance : "+ this.balance);
    }
}
public class mobileRecharge {
    public static void main(String[] args) {
        Recharge r = new  Recharge("9705080463");
        r.recharge(100, 20);
        r.display();
    }
}
