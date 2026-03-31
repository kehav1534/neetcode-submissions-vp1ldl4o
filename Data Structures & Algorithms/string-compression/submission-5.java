class Solution {
    public int compress(char[] chars) {
        String compressed = "";
        int count = 0;
        for(int i = 0; i < chars.length; i++){
            if(i==0){ 
                count++;
                compressed+=chars[0];
            }
            else if(i > 0 && chars[i-1]==chars[i])
                count++;
            else if(i > 0 && chars[i-1]!=chars[i]){
                if(count > 1)
                    compressed+=count;
                count = 1;
                compressed+=chars[i];
            }
        }
        if(count > 1)
            compressed+=count;
        for(int i = 1; i < compressed.length(); i++){
            chars[i] = compressed.charAt(i);
        }
        return compressed.length();
    }
}