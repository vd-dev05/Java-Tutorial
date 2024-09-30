
import  java.util.*;
public class test {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
       
        Scanner scanner = new Scanner(System.in);
        System.err.println("So la nhap ");
        int choice = scanner.nextInt();
        for (int i = 0; i <=  choice; i++) {
            System.out.println("them du lieu");
            String text = scanner.nextLine();
            a.add(i,text);
           
        }
        System.out.println("Du lieu cua ban:" + a );
        
        // a.add(text);
        System.out.println("Nhap phan tu de xoa");
        int value = scanner.nextInt();
        a.remove(value);
        System.out.println("Du lieu cua ban:" + a );
        
    }
   
}
