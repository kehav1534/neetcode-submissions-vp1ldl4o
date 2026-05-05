class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+= nums[i];
            this.nums[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        return left!=0?nums[right] - nums[left-1]:nums[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */