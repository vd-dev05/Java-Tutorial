// package tutorrial.interface; 

/**
 * Innermain
 * Tính Linh Hoạt
 * Thừa Kế Nhiều
 * Thiết Kế Theo Hợp Đồng
 * Test và Mock
 * su dung : Hệ Thống Plugin ,API
 */
interface Innermain {
    void print();

}

class Main implements Innermain {
    public void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.print();
    }
}
