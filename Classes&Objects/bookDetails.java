class Book{
    String title;
    String author;

    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }
}
public class bookDetails {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Mom : The Most Loved Girl..";
        b1.author="Himanshu Kumar";
        b1.display();
    }
}
