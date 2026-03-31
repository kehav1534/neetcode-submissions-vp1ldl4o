class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set newSet = new HashSet();
        for(int i=0; i<nums.length/2;i++){
            if(!newSet.add(nums[i]) || !newSet.add(nums[nums.length-1-i]))
                return true;
        }
        return false;
    }
}