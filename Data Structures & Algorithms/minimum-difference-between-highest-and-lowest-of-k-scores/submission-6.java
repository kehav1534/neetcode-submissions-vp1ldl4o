class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        
        min = nums[k-1]-nums[0];
        for(int i = 1; i < nums.length-k+1; i++){
            min = Math.min(min, nums[i+k-1]-nums[i]);
        }
        return min;
    }
}