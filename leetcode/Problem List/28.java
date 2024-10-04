class Solution {
    public int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();

        if ( n == 0) return 0;
        if ( n > m ) return -1;

        for (int i = 0; i <= m - n ; i ++) {
            if (haystack.substring(i,i +n).equals(needle)) return i;
        }
        return -1;
    }
}