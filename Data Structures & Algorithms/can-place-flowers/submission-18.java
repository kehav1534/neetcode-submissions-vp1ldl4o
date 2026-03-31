class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(len==1 && (flowerbed[0]==0 || n==0))
            return true;
        if(len==1 && flowerbed[0]==1)
            return false;
        for(int i = 0; i < len && n > 0; i++){
            if(i > 0 && flowerbed[i]==0 && i < len-1 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
                flowerbed[i]=1;
                n--; 
            }
            else if((i==0 || i == len-1) && flowerbed[i] == 0 && ((i+1 < len && flowerbed[i+1] == 0) || (i+1>=len && flowerbed[i-1]==0))){
                flowerbed[i]=1;
                n--;
            }
        }
        return n>0? false : true;
    }
}