package tutorrial.tryCatch;

import java.io.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// public class Main {
//     public static void main(String args[]) {
//         try {
//             int data = 50 / 0;
//         } catch (ArithmeticException e) {
//             System.out.println(e);
//         }
//         System.out.println("rest of the code...");
//     }
// }

public class Main {
    // public static void main(String args[]) {
    //     try {
    //         int a[] = new int[5];
    //         a[50]= 30/2;
    //     } catch (ArithmeticException e) {
    //         System.out.println("task 1 i completed");
    //     }catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("task 2 i completed");
    //     } catch (Exception e) {
    //         System.out.println("done");
    //     }
    //     System.out.println("reset");
    // }

    // xu li long nhau
    // public static void main(String args[]) {
    //     try {
    //         try {
    //             System.out.println("Thuc hien phep chia");
    //             int b = 39 / 2;
    //         } catch (ArithmeticException e) {
    //             System.out.println(e);
    //         }
    //         try {
    //             int a[] = new int[5];
    //             a[5] = 4;
    //         } catch (ArrayIndexOutOfBoundsException e) {
    //             System.out.println(e);
    //         }
    //         System.out.println("khoi lenh khac");
    //     } catch (Exception e) {
    //         System.out.println("xy ly ngoai le");
    //     }
    //     System.out.println("tiep tuc chuong trinh..");
    // }

// ArithmeticException
    // public static void main(String[] args) {
    //      try {
    //         int result = 10 / 0; // Chia cho 0
    //     } catch (ArithmeticException e) {
    //         System.out.println("Lỗi: " + e.getMessage());
    //     }
    // }

// ArrayIndexOutOfBoundsException 

    // public static void main(String[] args) {
    //     int [] arr = new int[5];

    //     try {
    //         int value = arr[4];
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Lỗi: " + e.getMessage());
    //     }
    //     System.out.println("done");
    // }
// NullPointerException
    // public static void main(String[] args) {
    //     String str = null;
    //     try {
    //         System.out.println(str.length()); 
    //     } catch (NullPointerException e) {
    //         System.out.println("Lỗi: " + e.getMessage());
    //     }
    // }

    // ClassCastException : Ép kiểu không hợp lệ

    // public static void main(String[] args) {
    //     Object obj = new Integer(10);
    //     try {
    //         String str = (String) obj; 
    //     } catch (ClassCastException e) {
    //         System.out.println("Lỗi: " + e.getMessage());
    //     }
    // } 
    // IllegalArgumentException 
    // public static void main(String[] args) {
    //     try {
    //         Thread.sleep(-1000); // Thời gian không hợp lệ
    //     } catch (IllegalArgumentException e) {
    //         System.out.println("Lỗi: " + e.getMessage());
    //     } catch (InterruptedException e) {
    //         System.out.println("Lỗi ngắt: " + e.getMessage());
    //     }
    // }

    // // IndexOutOfBoundsException
    // public static void main(String[] args) {
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add("Hello");
        
    //     try {
    //         String value = list.get(1); // Truy cập chỉ số không hợp lệ
    //     } catch (IndexOutOfBoundsException e) {
    //         System.out.println("Lỗi: " + e.getMessage());
    //     }
    // }

    //  NumberFormatException
    // public static void main(String[] args) {
    //     try {
    //         int number = Integer.parseInt("abc"); // Chuyển đổi chuỗi không hợp lệ
    //     } catch (NumberFormatException e) {
    //         System.out.println("Lỗi: " + e.getMessage());
    //     }
    // }

    public static void main(String[] args) {
        File file = new File("filekhongtontai.txt");
        try {
            FileReader fr = new FileReader(file); // Đọc file không tồn tại
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

}
