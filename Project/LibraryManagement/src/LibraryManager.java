package Project.LibraryManagement.src;

import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private Library library;
    private Scanner scanner;

    public LibraryManager() {
        library = new Library();
        scanner = new Scanner(System.in);
    }

   public void start() {
        while (true) {
            System.out.println("1. Thêm sách");
            System.out.println("2. Xóa sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private void addBook() {
        System.out.print("Nhập tiêu đề sách: ");
        String title = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Nhập ISBN: ");
        String isbn = scanner.nextLine();

        Book book = new Book(title, author, isbn);
        library.addBook(book);
        System.out.println("Sách đã được thêm thành công.");
    }

    private void removeBook() {
        System.out.print("Nhập ISBN sách cần xóa: ");
        String isbn = scanner.nextLine();
        library.removeBook(isbn);
        System.out.println("Sách đã được xóa (nếu ISBN tồn tại).");
    }

    private void searchBook() {
        System.out.print("Nhập tiêu đề sách cần tìm kiếm: ");
        String title = scanner.nextLine();
        List<Book> foundBooks = library.searchBook(title);
        
        if (foundBooks.isEmpty()) {
            System.out.println("Không tìm thấy sách nào.");
        } else {
            System.out.println("Sách tìm thấy:");
            for (Book book : foundBooks) {
                System.out.println(book);
            }
        }
    }
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        manager.start();
    }
}
