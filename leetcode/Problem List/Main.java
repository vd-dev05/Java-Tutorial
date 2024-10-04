/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String s = "Hello planet earth, you are a great planet222222.";
        int vowelCount = countVowels(s);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String s) {
        int count = 0;
        // Convert the string to a character array and iterate over it
        for (char c : s.toCharArray()) {
            // Check if the character is a vowel (both lowercase and uppercase)
            if ("AEIOUaeiou1231".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}