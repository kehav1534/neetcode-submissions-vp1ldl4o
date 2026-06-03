class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] asci = new int[256];
        int left = -1;
        int max = 0;
        for(int i = 0; i< s.length(); i++){
            asci[s.charAt(i)-0]++;
            while(asci[s.charAt(i)-0] > 1){
                asci[s.charAt(++left)-0]--;
            }
            max = (max < (i-left)) ? i- left : max;
        }
        return max;
    }
}
