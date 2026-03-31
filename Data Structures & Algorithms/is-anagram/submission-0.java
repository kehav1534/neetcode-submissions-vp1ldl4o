class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letterMap = new int[26];
        if(s.length()==t.length()){
            for(int i = 0; i < s.length(); i++){
                letterMap[s.charAt(i)-'a'] += 1;
                letterMap[t.charAt(i)-'a'] -= 1;
            }
            for(int i = 0; i < s.length(); i++){
                if(letterMap[s.charAt(i)-'a'] != 0 || letterMap[t.charAt(i)-'a']!=0)
                return false;
            }
            return true;
        }
        return false;
    }
}
