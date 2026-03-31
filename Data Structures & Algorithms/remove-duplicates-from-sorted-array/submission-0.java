class Solution {
    public int removeDuplicates(int[] nums) {
        int notRepeated = 0;
        int curr = nums[0];
        int i = 1;
        int count = 1;
        while(i < nums.length){
            if(nums[ notRepeated] == nums[i]){
                i++;
            }
            else{
                nums[++notRepeated] = nums[i++];
                count++;
            }
        }
        return count;
    }
}