class Product{
    int id;
    String name;
    int price;

    Product(int i, String n, int p){
        id = i;
        name = n;
        price = p;
    }
    void display(){
        System.out.println("ProductID : "+id);
        System.out.println("ProductName : "+name);
        System.out.println("Price : " + price);
    }
}
public class product23 {
    public static void main(String[] args) {
        Product n = new  Product(121133, "buds", 21333);
        n.display();
    }
}
