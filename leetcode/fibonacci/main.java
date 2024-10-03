package leetcode.fibonacci;

// import java.util.Scanner;

// public class Main {
//     public int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return fibonacci( n -1 ) + fibonacci(n - 2) ;
//     }

//     public static void main(String[] args) {

//         Main obj = new Main();

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Nhap day so can fibo: ");
//         int a = scanner.nextInt();
        
//         for (int i = 0; i <= a; i++) {
//             System.err.println("Fibonacci("+ i+") = " + obj.fibonacci(i));
//         }
//     }

// }   


// 509. Fibonacci Number
class Solution {
     
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}