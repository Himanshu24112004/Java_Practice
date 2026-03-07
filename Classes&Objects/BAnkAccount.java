class BankAccount{
    String accountHolder;
    double balance;

    void showBalance(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Balance : "+balance);
    }
}
public class BAnkAccount{
    public static void main(String[] args) {
        BankAccount b1= new BankAccount();
        b1.accountHolder="Himanshu Kumar";
        b1.balance=10000000;
        b1.showBalance();
    }
}