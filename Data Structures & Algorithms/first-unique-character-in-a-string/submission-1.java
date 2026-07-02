
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
            while(left < s.length() && freq[s.charAt(left)-'a']>1) left++;
        }
        while(left < s.length() && freq[s.charAt(left)-'a']>1) left++;

        if(left<s.length()) return left;
        else return -1;
    }
}









