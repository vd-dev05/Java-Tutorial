package tutorrial.stringline.lab;
import  java.util.*;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap username: ");
        String user = scanner.nextLine();
        if (user.trim().isEmpty()) {
            System.err.println("Ban ko dc de trong");
        }
        if (user.equals("hoidanit")) {
            System.out.println("Dung tai khoan ");
            System.out.print("Nhap password :" ); 
            String pass = scanner.nextLine();
                if (pass.length() > 6) {
                    System.out.println("Password hop le ");
                }else {
                    System.out.println("Password ko sau ki tu");
                }
            System.out.println("tai khoan : "+ user + ", mat khau : "+pass);
        }
        scanner.close();

    }
}
