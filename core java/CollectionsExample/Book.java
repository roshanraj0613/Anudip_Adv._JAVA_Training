package CollectionsExample;

import java.util.LinkedHashMap;
import java.util.Map;

// Book Class
public class Book {
    private final String bookTitle;
    private final String authorName;
    private final double price;

    // Constructor

    public Book(String bookTitle, String authorName, double price) {
        // Initializing the variables
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
    }

    public String getBookTitle() {
        // Returning the bookTitle
        return bookTitle;
    }

    public String getAuthorName() {
        // Returning the authorName
        return authorName;
    }

    public double getPrice() {
        // Returning the price
        return price;
    }

    @Override
    public String toString() {

        // Overriding the toString method
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}

class Main2 {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<Integer, Book> bookMap = new LinkedHashMap<>();
        // Adding Books to the LinkedHashMap

        bookMap.put(1, new Book("Book1", "Author1", 100.0));
        bookMap.put(2, new Book("Book2", "Author2", 200.0));
        bookMap.put(3, new Book("Book3", "Author3", 300.0));
        bookMap.put(4, new Book("Book4", "Author4", 400.0));
        bookMap.put(5, new Book("Book5", "Author5", 500.0));

        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            // Getting Key
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}