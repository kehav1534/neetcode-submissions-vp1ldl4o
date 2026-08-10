class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        
        min = nums[k-1]-nums[0];
        int j = 1;
        for(int i = k; i < nums.length; i++, j++){
            min = Math.min(min, nums[i]-nums[j]);
        }
        return min;
    }
}