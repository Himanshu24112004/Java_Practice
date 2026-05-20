class Product{
    private String productName;
    private String productCode;
    private int price ;

    public void setProdName(String productName){
        this.productName = productName;
    }

    public void setProdCode(String productCode){
        this.productCode = productCode;
    }

    public void setprice(int price){
        this.price = price;
    }

    public String getProdName(){
        return productName;
    }

    public String getProdCode(){
        return productCode;
    }

    public int  getPrice(){
        return price;
    }

    public void applyDiscount(double percentage){
        price  -= price*percentage/100;
    }
}
public class encap14 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProdName("laptop");
        p.setProdCode("H23GH214");
        p.setprice(40000);
        System.out.println(p.getProdName());
        System.out.println(p.getProdCode());
        System.out.println(p.getPrice());
        p.applyDiscount(20);
        System.out.println(p.getPrice());
    }
}
