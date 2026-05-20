class Loan{
    double principle;
    Loan(double principle){
        this.principle=principle;
    }
    double interest(double rate){
        return this.principle*rate;
    }
    double interest(double rate, double years){
        return this.principle*rate*years;
    }
}
public class loanInterest {
    public static void main(String[] args) {
       Loan l = new Loan(50000);
       System.out.println(l.interest(0.1, 2)); 
    }
}
