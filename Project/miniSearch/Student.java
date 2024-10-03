package Project.miniSearch;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Student {
    public static void searchStudentByName(String filename, String studentName) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean found = false;
            
            System.out.printf("%-15s %-5s %-5s %-5s %-5s %-10s%n", "Tên", "Tuổi", "Điểm1", "Điểm2", "Điểm3", "Ngành");
            System.out.println("-----------------------------------------------------------");
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data[0].equalsIgnoreCase(studentName)) {
                    System.out.format("%-15s %-5s %-5s %-5s %-5s %-10s%n", 
                                      data[0], data[1], data[2], data[3], data[4], data[5]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy sinh viên có tên: " + studentName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filename = "D:/Java/Project/mini/input.txt";
        String studentName = "Nguyen Minh E";
        searchStudentByName(filename, studentName);
    }
}
