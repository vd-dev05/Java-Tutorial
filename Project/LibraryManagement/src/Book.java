package Project.LibraryManagement.src;
public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter cho trường isbn
    public String getIsbn() {
        return isbn;
    }

    // Getter cho trường title
    public String getTitle() {
        return title;
    }

    // Getter cho trường author
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
