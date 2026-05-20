class Cart{
    int items ;

    Cart(int items){
        this.items=items;
    }

    double total(double price){
        return this.items*price;
    }

    double total(double price, double discount){
        return this.items*price - discount;
    }
}
public class shoppingCart {
    public static void main(String[] args) {
        Cart c = new  Cart(5);

        System.out.println(c.total(200, 300));
    }
}
