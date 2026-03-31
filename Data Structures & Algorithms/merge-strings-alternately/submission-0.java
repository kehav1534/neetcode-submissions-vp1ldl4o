class Solution {
    public String mergeAlternately(String word1, String word2) {
        String sent = "";
        int l1 = 0;
        int l2 = 0;
        while(l1<word1.length() && l2< word2.length()){
            sent+= word1.charAt(l1++);
            sent+= word2.charAt(l2++);
        }
        while(l1<word1.length())
            sent += word1.charAt(l1++);
        while(l2<word2.length())
            sent += word2.charAt(l2++);
        return sent;
    }
}