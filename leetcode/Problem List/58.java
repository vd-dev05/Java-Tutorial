class Solution {
    public int lengthOfLastWord(String s) {
           s = s.trim();
           String[] space = s.split(" ");

           if (space.length == 0) {
            return 0;
           } 
           return space[space.length -1 ].length();
    }
}