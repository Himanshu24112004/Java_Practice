class AccountHolder{
    private String accountNumber;
    private String accountHolder;
    private  double balance;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountNumber(){
        return  accountNumber;
    }

    public String getAccountHolder(){
            return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(int amount){
             balance += amount;
    }

    public void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
public class encap12 {
    public static void main(String[] args) {
         AccountHolder a = new AccountHolder();
         a.setAccountNumber("hksnak63656");
         a.setAccountHolder("Himanshu Kumar");
         a.setBalance(20000);
         System.out.println(a.getAccountNumber());
         System.out.println(a.getAccountHolder());
         System.out.println(a.getBalance());
         a.deposit(10000);
         System.out.println(a.getBalance());
         a.withdraw(1000);
         System.out.println(a.getBalance());
    }
}
