class Solution {
    public int lengthOfLastWord(String s) {
        int ptr = s.length() - 1;
        int length = 0;
        char out = s.charAt(ptr) ;
        while(( out < 'a' || out > 'z' ) && (out < 'A' || out > 'Z' )){
            ptr--;
            out = s.charAt(ptr) ;
        }
        while(ptr >= 0 && ((out >= 'a' && out <= 'z' ) || (out >= 'A' && out <= 'Z' ))){
            ptr--;
            length++;
            out = ptr >= 0? s.charAt(ptr) : ' ' ;

        }
        return length;

    }
}