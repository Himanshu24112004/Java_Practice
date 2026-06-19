class BanKAccount{
    double balance =  10000;

    void deposit(double amount){
            balance += amount;
    }
    void withdraw(double amount){
        balance -= amount;
    }
}
class SavingAccount extends BanKAccount{
    void withdraw(doube amount){
        if(amount <= 5000){
            balance -= amount;
            System.out.println("Savings Balance : "+balance);
        }
        else{
            System.out.println("Withdrawal limit exceeded");
        }
    }
}
class CheckingAccount extends BanKAccount{
    void withdraw(double amount){
        balance =  balance - amount -100;
        System.out.println("Checking Balance : "+balance);
    }
}
public class inherit9 {
    public static void main(String[] args) {
        BanKAccount b1 = new SavingAccount();
        BankAccount b2 = new CheckingAccount();

        b1.withdraw(4000);
        b2.withdraw(4000);
    }
}
