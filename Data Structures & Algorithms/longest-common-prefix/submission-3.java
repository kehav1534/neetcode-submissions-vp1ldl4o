class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix= strs[0];
        for(int i = 1; i < strs.length ;i++){
            String temp = "";
            for(int j = 0; j < prefix.length(); j++){
                if(j < strs[i].length()&& 
                    strs[i].charAt(j)==prefix.charAt(j))
                    temp+=prefix.charAt(j);
                else{
                    prefix=temp;
                    break;
                }
            }
        }
        return prefix;
    }
}