import  java.util.*;
public class bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
           
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.println("Nhap them Y/N");
            String option = scanner.nextLine();
            if (option.equals("N" ) || option.equals("n") ) {
                break;
            }
         
           
        }
        System.out.println("Mang Hien co" +list);
        Double sum = list.stream().reduce(0.0, Double::sum);
        System.out.println("Tong cua mang la: " + sum);
    }
}
