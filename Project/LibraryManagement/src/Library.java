package Project.LibraryManagement.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;
    private final String filePath = "D:/Java/Project/LibraryManagement/data.txt/book.txt";

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooksToFile();
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        saveBooksToFile();
    }

    public List<Book> searchBook(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    private void loadBooksFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    books.add(new Book(details[0], details[1], details[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Không thể tải sách từ tệp: " + e.getMessage());
        }
    }

    private void saveBooksToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Book book : books) {
                bw.write(book.getTitle() + "," + book.getAuthor() + "," + book.getIsbn());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Không thể lưu sách vào tệp: " + e.getMessage());
        }
    }


}
