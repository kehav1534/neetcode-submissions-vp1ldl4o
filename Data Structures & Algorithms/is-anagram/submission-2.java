class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphaChar = new int[26];
        if(s.length()==t.length()){
            for(int i=0; i<s.length();i++){
                alphaChar[s.charAt(i)-'a']+=1;
                alphaChar[t.charAt(i)-'a']-=1;
            }
            for(int i = 0; i<s.length();i++){
                if(alphaChar[s.charAt(i)-'a']!=0)return false;
            }
            return true;
        }
        return false;
    }
}
