import java.util.*;
// public class test {
    
//     public static void bai1 ()  {
//     	Scanner scanner = new Scanner(System.in);
// 		System.out.print("Nhập vào 1 số nguyên bất kỳ: ");
// 		int value = scanner.nextInt();

// 		int count = 0;
//         for (int i = 2 ; i < value -1 ; i ++ ) {
//             if (value % 2 == 0) {
//                 System.out.println("Uoc chung cua la : " +i);
//                 count++;
//             }
//         }
//         if (count == 0 ) {
//             System.out.println(value + "la so nguyen to");
//         }else {
//             System.out.println(value + "ko phai la so nguyen to");
//         }
//         scanner.close();

//     }

//     public static void bai2() {
//         Scanner scanner = new Scanner(System.in);
// 		System.out.print("Nhap vao so ban cuu chuong: ");
// 		int value = scanner.nextInt();
//         System.out.println("bang cuu chuong");
//         for (int i = 1 ; i < 11 ; i++ ) {
//             System.out.println(value + " x " + i + " = " + (value * i) );
//         }
//     }

//     public static void bai3() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Nhap so luong phan tu cua arr  : ");
// 		int value = scanner.nextInt();
//         int [] a = new int[value];
      
//         for (int i = 0 ; i < a.length ; i++ ) {
//             System.out.print("Nhap phan tu : ");
//             a[i] = scanner.nextInt();
//         }

//        int max = a[0];

//        for (int i = 0 ; i < a.length ; i++) {
//             max = Math.max(max, a[i]);
//        }
//        int min = a[0];
//        for (int i = 0 ; i < a.length ; i ++ ) {
//             min = Math.min(min, a[i]);
//        }

//         System.out.println("arr ban dau : " + Arrays.toString(a));
//        System.out.println("Phan tu nho nhat la " + min);
//        System.out.println("Pha tu cao nhat la "+ max);
    

//     }
//     public class Student {
//         String name;
//         int age;
        
//     }
//     public static void main(String[] args) {

//         Student a = new Student();
//         a.name = "alex";
//         a.age = 29;

//         System.out.println("Name: " + a.name + " ,"+"Age: " + a.age );
//         // bai1();
//         // bai2();
//         bai3();
//         // for (int i )

//     }
    
// }
//  OOP

// public class Student {
//     String name;
//     int age;
//     int number = 20;


//     public static void main(String[] args) {
//       Student a = new Student();
//       // a.name = "Alex";
//       // a.age = 20;
//       // System.out.println("Name: " + a.name + " ,"+"Age: " + a.age );
//       a.number = 21;
//       System.out.println(a.number);
      
//     }
//   }

// Static vs. Public

public class Main {

   // static void staticMethod() {
   //    System.out.println("Hello World");
   // }

   // public void myMethod() {
   //    System.out.println("method Hello world");
   // }

   // // Access Methods With an Object
   // public void second(int s)  {
   //    System.out.println("So giay truyen la : "+ s);
   // }

   // Constructor Parameters
   // int modelYear;
   // String modelCard;

   // public Main(int year,String card) {
   //    modelYear = year;
   //    modelCard = card;
   // }

   int age;
   String name;

   public Main (String name, int age) {
      this.name = name;
      this.age = age;
   }

   public static void main(String[] args) {
      // staticMethod();

      // Constructor Parameters
      // Main myObj = new Main(1995,"vinfast");
      // System.out.println("chiec xe "+myObj.modelCard + " san xuat nam " + myObj.modelYear);

      // Main myObj = new Main("vinfast",1995);
      // System.out.println(myObj.name + myObj.age);
      
      // myObj.myMethod();
      // Scanner scanner = new Scanner(System.in);
      // System.out.print("Nhap so giay truyen vao");
      // int a = scanner.nextInt();
      // myObj.second(a);
       


   }
}