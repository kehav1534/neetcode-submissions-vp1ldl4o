class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set newSet = new HashSet();
        for(int num : nums){
            if(!newSet.add(num)) return true;
        }
        return false;
    }
}