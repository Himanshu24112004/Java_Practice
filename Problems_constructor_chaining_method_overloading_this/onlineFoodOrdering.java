class Order{
    String item ;
    int quantity;

    Order(String item){
        this(item,1);
    }

    Order(String item , int quantity){
        this.quantity = quantity;
        this.item = item ;
    }

    double total(double price){
        return this.quantity*price;
    }

    double total(double price , double tax){
        return (this.quantity*price)+tax;
    }
}

public class onlineFoodOrdering {
    public static void main(String[] args) {
        Order o = new Order("pizza", 2);
       double bill = o.total(200, 50);

       System.out.println("Total Bill : "+  bill);
    }
}
