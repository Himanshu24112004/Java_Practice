class BankAccount{
    double balance = 10000;
    
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited : "+amount);
        System.out.println("Balance : "+ balance);
    }

    void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawn : "+amount);
        System.out.println("Balance : "+ balance);
    }
}
class SavingsAccount extends BankAccount{
    @Override
    void withdraw(double amount){
        if((balance - amount)<100){
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawn : "+amount);
            System.out.println("Balance : "+ balance);
        }
    }
}
public class poly7 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(5000);
        sa.withdraw(2000);
        sa.withdraw(15000);
    }
}
