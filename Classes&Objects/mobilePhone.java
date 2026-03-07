class mobile{
    String brand ;
    int  price;

    void showDetails(){
        System.out.println("Brand : "+brand);
        System.out.println("Price : "+price);
    }
}
public class mobilePhone {
    public static void main(String[] args) {
        mobile m1 =new mobile();
        m1.brand="vivo";
        m1.price=20000;
        m1.showDetails();
    }
}
