
import java.util.ArrayList;
public class Book {
    private final int bookId;
    private final String bookName;
    private final String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}



class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Adding books to the list
        books.add(new Book(1, "Book1", "Author1"));
        books.add(new Book(2, "Book2", "Author2"));
        books.add(new Book(3, "Book3", "Author3"));

        // Displaying all book details
        for (Book book : books) {
            System.out.println(book);
        }
    }
}