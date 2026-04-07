class Solution {
    public int minimumRecolors(String blocks, int k) {
        int countW = 0;
        int minOperation = 0;
        int end = 0;
        for(int i = 0; i < k; i++){
            if( blocks.charAt(i)=='W')
                countW++;
            end++;
        }
        minOperation = countW;
        while(end < blocks.length()){
            if(blocks.charAt(end-k)=='W')
                countW--;
            if(blocks.charAt(end)=='W')
                countW++;
            minOperation = countW < minOperation ? countW : minOperation;
            end++;
        }
        return minOperation;
         
    }
}