abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.printf("Current Balance: %.2f\n", balance);
    }
}
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% interest rate

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    void deposit(double amount) {
     double interest = amount * INTEREST_RATE;
        balance += amount + interest;
        System.out.printf("Savings : Deposited %.2f\n + %.2f bonus interest\n", amount, interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Savings : Withdrew %.2f\n", amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.0;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.printf("Current : Deposited %.2f\n", amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.printf("Current : Withdrew %.2f\n", amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
public class abstract3 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount current = new CurrentAccount(500);

        savings.deposit(200);
        savings.withdraw(150);
        savings.displayBalance();

        current.deposit(300);
        current.withdraw(900);
        current.displayBalance();
    }
}
