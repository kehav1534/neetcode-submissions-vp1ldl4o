class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int minPositiveNum = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
        }
        if(!map.containsKey(1)) return 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]-1 > 0 && !map.containsKey(nums[i]-1)){
                minPositiveNum = nums[i]-1 < minPositiveNum ? nums[i]-1: minPositiveNum;
            }
            if(nums[i]+1 > 0 && !map.containsKey(nums[i]+1)){
                minPositiveNum = nums[i]+1 < minPositiveNum ? nums[i]+1: minPositiveNum;

            }
        }
        return minPositiveNum;
    }
}