public class Book_1 {
    String name;
    String author;
    int pages;
    double price;
    int year;
    String publisher;
    
    public Book(String name, String author, int pages, double price, int year, String publisher) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.year = year;
        this.publisher = publisher;
    }
    
    public void display() {
        System.out.println("Book: " + name);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
    }
    
    public void display(boolean withPrice) {
        if (withPrice) {
            System.out.println("Book: " + name);
            System.out.println("Price: $" + price);
        } else {
            display();
        }
    }
    
    public void display(boolean withPrice, boolean withAuthor) {
        if (withPrice && withAuthor) {
            System.out.println("Book: " + name);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
        } else {
            display();
        }
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 400, 29.99, 2023, "ABC Publications");
        book1.display();
        System.out.println("--------");
        book1.display(true);
        System.out.println("--------");
        book1.display(true, true);
    }
}
