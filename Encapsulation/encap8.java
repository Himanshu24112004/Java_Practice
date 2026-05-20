class Book{
    private String title;
    private String author;
    private double price;

    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(double price){
         this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void applyDiscount(double percentage){
        price -= price * percentage/100 ;
    }
}
public class encap8 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java");
        b.setAuthor("James Gosling");
        b.setPrice(1500);
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getPrice());
        b.applyDiscount(20);
        System.out.println("price after discount : "+b.getPrice());
    }
}
