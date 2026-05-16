class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
        for(int i = 0; i <= n; i++){
            int num = i;
            while(num>0){
                if(num%2==1) count[i]++;
                num = num>>1;
            }
        }
        return count;
    }
}
