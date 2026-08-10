class Solution {
    public int minimumRecolors(String blocks, int k) { 
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < blocks.length(); i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
            if(i-k+1 > 0){
                if(blocks.charAt(i-k)=='W') count--;
            }

            if(i-k+1>=0){
                min = Math.min(min , count);
            }

        }
        return min;
    }
}