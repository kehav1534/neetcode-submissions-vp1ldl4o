class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        int tempCount = 0;
        while(right < nums.length){
            if(sum+nums[right] < target){
                sum += nums[right];
                tempCount++;
            }
            else if(sum+nums[right]>=target){
                tempCount++;
                sum += nums[right];
                while(left <= right && sum-nums[left] >= target){
                    sum-=nums[left];
                    tempCount--;
                    left++;
                }
                count =( (tempCount < count || count==0) && tempCount>0)? tempCount : count;
            }
            right++;
            System.out.println(tempCount);
        }
        return count;
    }
}