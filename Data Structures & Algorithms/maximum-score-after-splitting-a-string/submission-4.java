class Solution {
    public int maxScore(String s) {
        int totalZeros = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='0')
                totalZeros++;
        }
        int max = 0;
        int currZero = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)=='0')
                currZero++;
            int temp = 2*currZero + (s.length()-(i+1)-totalZeros);
            max = temp > max ? temp : max;
        }
        return max;
    }
}