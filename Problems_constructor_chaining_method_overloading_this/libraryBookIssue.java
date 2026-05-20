class Book{
    String title;
    int pages;

    Book(String title){
        this(title,100);
    }

    Book(String title, int pages){
        this.title=title;
        this.pages=pages;
    }

    void issue(int days){
        System.out.println("Issued for "+days+" days.");
    }

    void issue(int days , int fine){
        System.out.println("Issued with fine/day : "+ fine);
    }
}
public class libraryBookIssue {
    public static void main(String[] args) {
        Book b = new Book("THE JUNGLE BOOK");

        b.issue(5, 10);
    }
}
