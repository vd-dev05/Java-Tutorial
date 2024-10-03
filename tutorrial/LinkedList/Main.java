package tutorrial.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Thêm nút vào danh sách
        System.out.println("Thêm nút vào danh sách");
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // Kết quả: 10 -> 20 -> 30 -> null

        // Xóa nút
        System.out.println("Xóa nút");
        list.delete(20);
        list.printList(); // Kết quả: 10 -> 30 -> null

        // Xóa nút đầu
        System.out.println("Xóa nút đầu");
        list.delete(10);
        list.printList(); // Kết quả: 30 -> null
    }
}
