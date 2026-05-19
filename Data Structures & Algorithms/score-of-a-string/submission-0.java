class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            sum+=abs(s.charAt(i)-s.charAt(i-1));
        }
        return sum;
    }
    int abs(int n){
        return n<0?-n:n;
    }
}