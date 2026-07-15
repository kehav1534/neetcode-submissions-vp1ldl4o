class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int max = 1;
        int maxFreq = s.charAt(0)-'A';
        freq[maxFreq]++;
        int left = 0;

        for(int i = 1; i<s.length(); i++){
            freq[s.charAt(i)-'A']++;
            if(freq[s.charAt(i)-'A'] > freq[maxFreq]) maxFreq = s.charAt(i)-'A';

            while( freq[maxFreq]+k < i-left+1)
            {
                freq[s.charAt(left)-'A']--;
                left++;
                if(freq[s.charAt(i)-'A'] > freq[maxFreq]) maxFreq = s.charAt(i)-'A';
                if(freq[s.charAt(left)-'A'] > freq[maxFreq]) maxFreq = s.charAt(left)-'A';


            }
            if( (freq[maxFreq]+k) >= (i-left+1) ) max = Math.max(max, i-left+1);

        }
        return max;
    }
}
