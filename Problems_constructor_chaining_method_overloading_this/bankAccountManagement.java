class BankAccount{
    String name;
    double balance;

    //constructor1
    BankAccount(String name){
        this(name,0);  // calls constructor 2 
    }

    //constructor 2
    BankAccount(String name , double balance){
        this.name=name;
        this.balance=balance;
    }
    
    //method overlapping
    void deposit(double amount){
        this.balance += amount;
    }

    void deposit(double amount , double bonus){
        this.balance += amount + bonus;
    }

    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Balance : "+this.balance);
    }
}
public class bankAccountManagement {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Himanshu Kumar", 10000);

        acc.deposit(500);
        acc.deposit(1000, 100);
    }
}
