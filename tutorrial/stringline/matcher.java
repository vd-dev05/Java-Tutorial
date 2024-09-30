import  java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class matcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
    // dinh nghia ham 
        Pattern pattern = Pattern.compile("admin",Pattern.CASE_INSENSITIVE);
    // phuong thuc de seacrh 
        Matcher matcher = pattern.matcher(name);
        boolean match = matcher.find();
        if (match) {
            System.out.println("Match found");
        } else {
            System.err.println("Match not found");
        }
    }
}
