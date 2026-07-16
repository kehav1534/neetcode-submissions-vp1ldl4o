class Solution {
    public int majorityElement(int[] nums) {
        int lock = 0;
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            if(n==nums[i]){
                lock++;
            }
            else{
                lock = Math.max(lock-1, 0);
            }
            if(lock==0){
                n = nums[i];
                lock++;
            }
        }
        return n;
    }
}