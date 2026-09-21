class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1) return "";
        String longestPrefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            String temp = "";
            while(j < longestPrefix.length() && j < strs[i].length() && strs[i].charAt(j)== longestPrefix.charAt(j)){
                temp+=strs[i].charAt(j++);
            }
            longestPrefix = temp;
            
        }
        return longestPrefix;
    }
}