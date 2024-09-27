package encapsulation;

import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {
    //     getandset obj = new getandset();
    //     obj.setName("hello world");
    //     System.out.println(obj.getName());
    // }
    public static void main(String[] args) {
        login obj = new login();

        Scanner scanner  = new Scanner(System.in);
        
        // System.out.println("Nhap username ");
        // String username = scanner.nextLine();
        // System.out.println("Nhap password ");
        // String password = scanner.nextLine();

        // obj.setLogin(password, username);
        // // System.out.println("username: "+ obj.getUserName() + " ," + "password : "+ obj.getPassWord());
        // System.out.println(String.format("username: %s, password: %s", obj.getUserName(), obj.getPassWord()));

        int age = 25;
        double height = 5.9;
        boolean isStudent = true;
      
        System.out.println(String.format("Age: %d, Height: %.1f, Is Student: %b", age, height, isStudent));
        
    }
}
