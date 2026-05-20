class  BankAccount{
    private int accountNumber;
    private double balance;

    public void setAccountNum(int accountNumber){
        this.accountNumber= accountNumber;

    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public int getAccountNum(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
}
public class encap5 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNum(105855);
        b.setBalance(24564);
        System.out.println(b.getAccountNum());
        System.out.println(b.getBalance());
    }
}
