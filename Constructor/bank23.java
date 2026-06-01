class BankAccount{
    String acn;
    int bal;

    BankAccount(String a, int b){
        acn = a;
        bal = b;
    }
    void display(){
        System.out.println("Account Holder Name : "+acn);
        System.out.println("Balance : "+bal);
    }
}
public class bank23 {
    public static void main(String[] args) {
        BankAccount b= new BankAccount("Himanshu Kumar", 2311333);
        b.display();
    }
}
