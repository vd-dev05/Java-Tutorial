import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
public class KeyValue {
    private  String key;
    private String value;

    public KeyValue(String key,String value) {
        this.key = key;
        this.value = value;
    }

    // setter
    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
    // getter 
    public String getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
    
    public static void main(String[] args) {
        HashMap<String,String> hashCity = new HashMap<>();
        String filePath ="D:/Java lettcode/Java-Tutorial/tutorrial/Hashmap/city.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] part = line.split("=");
                if (part.length == 2) {
                    hashCity.put(part[0].trim(), part[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Erorr File "+ e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten thanh pho: ");
        String nameCity = scanner.nextLine();

        if (hashCity.containsKey(nameCity)) {
            String contry = hashCity.get(nameCity);
            KeyValue data = new KeyValue(nameCity, contry);

            System.out.println( "Quoc Gia "+ data.getKey() + "\nThanh Pho " + data.getValue());
        }else {
            System.out.println("Error" + nameCity);
        }
        scanner.close();

    }
}
