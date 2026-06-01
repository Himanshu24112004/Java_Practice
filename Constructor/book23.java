class Book{
    String name;
    String author ;

    Book(String b, String a){
        name = b;
        author = a;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Author : "+author);
    }
}
public class book23 {
    public static void main(String[] args) {
        Book b = new Book("MY FAVORITE GIRL : MY MOM", "HIMANSHU KUMAR");
        b.display();
    }
}
