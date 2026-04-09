class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int minPositiveNum = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            if(!map.contains(nums[i])){
                map.add(nums[i]);
            }
        }
        if(!map.contains(1)) return 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]-1 > 0 && !map.contains(nums[i]-1)){
                minPositiveNum = nums[i]-1 < minPositiveNum ? nums[i]-1: minPositiveNum;
            }
            if(nums[i]+1 > 0 && !map.contains(nums[i]+1)){
                minPositiveNum = nums[i]+1 < minPositiveNum ? nums[i]+1: minPositiveNum;

            }
        }
        return minPositiveNum;
    }
}