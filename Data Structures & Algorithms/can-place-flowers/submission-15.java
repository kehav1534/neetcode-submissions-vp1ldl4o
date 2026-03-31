class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && (flowerbed[0]==0 || n==0))
            return true;
        if(flowerbed.length==1 && flowerbed[0]==1)
            return false;
        for(int i = 0; i < flowerbed.length && n > 0; i++){
            if(i > 0 && flowerbed[i]==0 && i < flowerbed.length-1 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
                flowerbed[i]=1;
                n--; 

            }
            else if((i==0 || i == flowerbed.length-1) && flowerbed[i] == 0 && ((i+1 < flowerbed.length && flowerbed[i+1] == 0) || (i+1>=flowerbed.length && flowerbed[i-1]==0))){
                flowerbed[i]=1;
                n--;
            }
                        
            
            System.out.println(i+" "+n);
            System.out.println(i==0);
        }
        return n>0? false : true;
    }
}