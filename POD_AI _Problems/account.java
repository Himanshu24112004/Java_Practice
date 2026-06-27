import java.util.Scanner;

class Account{
    String accountHolder;
    int balance;

    Account(String accountHolder , int balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    int getFinalBalance(){
        return 0;
    }
}
class SavingAccount extends Account{
    int interestAmount;
    SavingAccount(String accountHolder, int balance, int interestAmount){
        super(accountHolder,balance);
        this.interestAmount= interestAmount;
    }

    int getFinalBalance(){
        return balance + interestAmount;
    }
}


public class account {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String holder = sc.nextLine();
       int bal = sc.nextInt();
       int interest = sc.nextInt();

       Account sa = new SavingAccount(holder, bal, interest);

       System.out.println("Account holder: "+sa.accountHolder);
       System.out.println("Final Balance: "+sa.getFinalBalance());

       sc.close();
    }
}
