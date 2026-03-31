class Solution {
    public int lengthOfLastWord(String s) {
        int ptr = s.length() - 1;
        int length = 0;
        while((s.charAt(ptr) < 'a' || s.charAt(ptr) > 'z' ) && (s.charAt(ptr) < 'A' || s.charAt(ptr) > 'Z' )){
            ptr--;
        }
        while(ptr >= 0 && ((s.charAt(ptr) >= 'a' && s.charAt(ptr) <= 'z' ) || (s.charAt(ptr) >= 'A' && s.charAt(ptr) <= 'Z' ))){
            ptr--;
            length++;
        }
        return length;

    }
}