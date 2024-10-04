// 9. Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 && x % 10 == 0 && x != 0) {
            return false;
        }

        String str = Integer.toString(x);
        String test = new StringBuilder(str).reverse().toString();

        return str.equals(test);
    }
}