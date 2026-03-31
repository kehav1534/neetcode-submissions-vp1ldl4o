class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] alpha = new int[256];
        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            alpha[c]++;

            while(alpha[c] > 1) {
                alpha[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}