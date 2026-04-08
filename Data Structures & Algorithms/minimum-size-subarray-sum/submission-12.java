class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        while(right < nums.length){
            if(sum+nums[right] < target){
                sum += nums[right];
            }
            else if(sum+nums[right]>=target){
                sum += nums[right];
                while(sum-nums[left] >= target){
                    sum-=nums[left++];
                }
                count = ( right-left+1 < count || count==0) ? right-left+1 : count;
            }
            right++;
        }
        return count;
    }
}