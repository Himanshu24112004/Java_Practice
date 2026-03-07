class laptop{
    String brand;
    int ram;
 
    void showSpecs(){
        System.out.println("Brand : "+brand);
        System.out.println("RAM : "+ram+" GB");
    }
}
public class laptopDetails {
    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.brand="ASUS";
        l1.ram=16;
        l1.showSpecs();
    }
}
