package tutorrial.LinkedList;

public class SinglyLinkedList {
    private  Node head;

    public void add( int data) {
        Node obj = new Node(data);

        if( head == null) {
            head = obj;
        }else {
            Node curr = head ;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = obj;
        }
        
    }
        // Xóa nút theo giá trị
        public void delete(int data) {
            if (head == null) return; // Nếu danh sách rỗng
    
            // Nếu nút đầu tiên là nút cần xóa
            if (head.data == data) {
                head = head.next; // Đặt nút tiếp theo làm đầu
                return;
            }
    
            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next; // Xóa nút
                    return;
                }
                current = current.next; // Duyệt tiếp
            }
        }
    
        // In danh sách
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null"); // Kết thúc danh sách
        }
}
