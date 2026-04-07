class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        int minScore = nums[k-1] - nums[0];
        for(int i  = k; i < nums.length; i++){
            int diff = nums[i] - nums[i-k+1];
            minScore = diff < minScore? diff : minScore;
        }
        return minScore;
    }
}