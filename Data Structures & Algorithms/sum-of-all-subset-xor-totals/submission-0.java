class Solution {
    public int subsetXORSum(int[] nums) {
        return subSequence(0, 0, nums)/2;
    }
    public int subSequence(int sum, int i, int[] nums){
        if(i>=nums.length){
            return sum;
        }
        int prev = sum;
        sum = sum ^ nums[i];
        sum += subSequence(sum, i+1, nums);
        sum+= subSequence(prev, i+1, nums);
        return sum;
    } 
}