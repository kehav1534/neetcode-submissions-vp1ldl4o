class Solution {
    public int longestOnes(int[] nums, int k) {
        int countOne = 0;
        int left = 0;
        int maxLen = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==1) countOne++;

            if((countOne + k ) >= (i-left+1)){
                maxLen = Math.max(maxLen, (i-left+1));
            }
            else{
                while(countOne+k < i-left+1){
                    if(nums[left]==1) countOne--;
                    left++;
                }
            }
        }
        return maxLen;
    }
}