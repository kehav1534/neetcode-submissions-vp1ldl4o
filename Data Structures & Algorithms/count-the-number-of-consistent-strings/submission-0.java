class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] accepted = new int[26];
        for(int i = 0; i < allowed.length(); i++){
            accepted[allowed.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i = 0; i < words.length; i++){
            boolean isConsistent = true;
            for(int j = 0; j < words[i].length(); j++){
                if(accepted[words[i].charAt(j)-'a']!=1){
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}