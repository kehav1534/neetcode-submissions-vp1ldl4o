class Solution {
    public int compress(char[] chars) {
        String compressed = "";
        int count = 0;
        int ptr = 0;
        for(int i = 0; i < chars.length; i++){
            if(i==0){ 
                compressed+=chars[0];
                count++;
            }
            else if(i > 0 && chars[i-1]==chars[i])
                count++;
            else if(i > 0 && chars[i-1]!=chars[i]){
                if(count > 1){
                    compressed+=count;
                    for(int j = 0; j < compressed.length(); j++){
                        chars[ptr++] = compressed.charAt(j);
                    }
                }
                else{
                    chars[ptr++] = compressed.charAt(0);
                }
                count = 1;
                compressed= ""+chars[i];
            }
        }
        if(count > 1)
            compressed+=count;
            for(int j = 0; j < compressed.length(); j++){
                chars[ptr++] = compressed.charAt(j);
            }
        return ptr;
    }
}