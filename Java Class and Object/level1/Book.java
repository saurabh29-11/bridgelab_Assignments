public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "James Gosling", 599.99);
        book.displayDetails();
    }
}
