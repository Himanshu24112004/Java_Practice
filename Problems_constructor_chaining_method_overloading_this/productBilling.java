class Product{
    String name ;
    double price ;

    Product(String name){
        this(name,0);
    }

    Product(String name, double price){
        this.name = name ;
        this.price = price ;
    }
    
    double calculate(double tax){
        return this.price + tax;
    }

    double calculate(double tax , double discount){
        return this.price + tax - discount;
    }
}
public class productBilling {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000);

        System.out.println(p.calculate(2000, 3000));
    }
}
