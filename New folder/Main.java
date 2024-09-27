/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button t o execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    
    public static void bai1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nghiem phuong trinh ");
        // tax = scanner.nextInt();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        
        // double delta = - b / a ;
        
        if (a ==  0 && b == 0) {
            System.out.println("Phuong trinh vo so nhiem");
        }else if ( a == 0 && b != 0 ) {
            System.out.println("Phuong vo nhiem");
        } else {
          float x = (float) - b / a;
			System.out.printf("Phương trình có nghiệm = %.5f  ", x);

        }
        scanner.close();
    }
    public static void bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nghiem phuong trinh ");
        // tax = scanner.nextInt();
        System.out.print("a = ");
        double a = scanner.nextInt();
        System.out.print("b = ");
        double b = scanner.nextInt();
        System.out.print("c = ");
        double c = scanner.nextInt();
        
        double delta = b * b - (4 * a * c );
        
        if (delta < 0 ) {
            System.out.println("PT vo nhiem ");
        } else if (delta == 0) {
            double x = -b / (2 * a)  ;
            System.out.println("Pt co hai nhiem kep ");
            System.out.println("x = " + Math.abs(x));
            
        }else if (delta > 0 ) {
            double x1 = (-b + Math.sqrt(delta)/(2*a));
            double x2 = (-b - Math.sqrt(delta)/(2*a));
            System.out.println("Pt co 2 nhiem rieng biet");
            System.out.println("x1 = " +x1);
            System.out.print("x2 = " +x2);
        }
        
    }
    
    public static void bai3() {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien trong thang ban phai dung :");
        // System.out.print("a = ");
        int tax = scanner.nextInt();  

        if (tax > 0 && tax < 100 ) {
            System.out.println("Gia dien cua ban la 1000 ");
            long sotien = tax  * 1000;
            System.out.println("Tong tien cua ban la :" + sotien);
            // a = 1000;   
        }else  {
            System.out.println("Gia dien cua ban la 1500");
            long sotien = 100 * 1000 + (tax  - 100 ) * 1500 ;
            System.out.println("Tong tien cua ban la :" + sotien);
        }
        
        // System.out.println(a);
    }
    
	public static void main(String[] args) {
// 		System.out.println("Hello World");

//  kiem tra thue dong tien 
        // int  tax = 0 ;
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap so tien = ");
        // tax = scanner.nextInt();
        // if (tax >  0 &&  tax < 10  ) {
        //     System.out.println("Ban ko can phai dong thue");
        // }else if (tax > 10 && tax  < 15 ) {
        //     System.out.println("Ban phai nop 10% thue ");
        // } else if (tax > 15 && tax < 30 ) {
        //     System.out.println("Ban phai nop thue 20% thue ") ;
        // }else if (tax  > 30 ) {
        //     System.out.println("Ban phia nop thue 50% thue");
        // }
        // System.out.println(tax);
//  Chon tinh nang phep tinh 
        // System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        // System.out.println("++ ------------------ ++");
        // System.out.println("| 1. Cộng |");
        // System.out.println("| 2. Trừ |");
        // System.out.println("| 3. Kết thúc |");
        // System.out.println("++ ------------------ ++");
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Lựa chọn của bạn là : ");
        
        // int a = scanner.nextInt();
        // switch(a) {
        //   case 1:
        //       System.out.println("Kết Quả cong  " );
        //     break;
        //   case 2:
        //      System.out.println("Ket qua tru " );
        //     break;
        //   case 3 :
        //       System.out.println("Bye Bye");
        //     // code block
        // }
// Tinh nghiem phuong trinh bac 2 

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhap so nghiem phuong trinh ");
        // // tax = scanner.nextInt();
        // System.out.print("a = ");
        // double a = scanner.nextInt();
        // System.out.print("b = ");
        // double b = scanner.nextInt();
        // System.out.print("c = ");
        // double c = scanner.nextInt();
        // bai 1
        // double delta = - b / a ;
        
        // if (a ==  0 && b == 0) {
        //     System.out.println("Phuong trinh vo so nhiem");
        // }else if ( a == 0 && b != 0 ) {
        //     System.out.println("Phuong vo nhiem");
        // } else {
        //     System.out.println("Ket qua Pt : " + delta);
        // }
        
        // bai2 
        // double delta = b * b - (4 * a * c );
        
        // if (delta < 0 ) {
        //     System.out.println("PT vo nhiem ");
        // } else if (delta == 0) {
        //     double x = -b / (2 * a)  ;
        //     System.out.println("Pt co hai nhiem kep ");
        //     System.out.println("x = " + Math.abs(x));
            
        // }else if (delta > 0 ) {
        //     double x1 = (-b + Math.sqrt(delta)/(2*a));
        //     double x2 = (-b - Math.sqrt(delta)/(2*a));
        //     System.out.println("Pt co 2 nhiem rieng biet");
        //     System.out.println("x1 = " +x1);
        //     System.out.print("x2 = " +x2);
        // }
        
        // bai3
        // System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        // System.out.println("++ ----------------------------------------- ++");
        // System.out.println("| 1. Giải phương trình bậc nhất |");
        // System.out.println("| 2. Giải phương trình bậc hai |");
        // System.out.println("| 3. Tính số tiền điện |");
        // System.out.println("| 4. Kết thúc |");
        // System.out.println("++ ------------------ ++");
        
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Nhap lua chon cua ban : ");
        // int choice = scanner.nextInt();
      
        // switch (choice) {
        //     case 1 : 
        //         bai1();
        //     case 2 :
        //         bai2();
        //     case 3  : 
        //         bai3();
        // }
        
//  Array ,for, while
        // String[] cars = {"item 1","item 2","item 3", "item 4"  };
        // System.out.println(cars[1]); # log item 2 
        
        // int[] number = {1,2,3,4,62,2,100};
        // for (int i = 0 ; i < number.length ; i ++ ) {
        //     System.out.println(number[i]);
        // }
        // sort arr 
    //   int[] number = {1,2,3,4,62,2,100};
    //     for (int i = 0 ; i < number.length - 1   ; i ++ ) {
    //         for (int j = i + 1 ; j  < number.length ; j ++ ) {
    //             if (number[i] > number[j]) {
    //                 int temp = number[i];
    //                 number[i] = number[j];
    //                 number[j] = temp;
    //             }
    //         }
    //     }
    //     System.out.println( Arrays.toString(number));
       
        
 
        
        
        
        
        
	}
	
}