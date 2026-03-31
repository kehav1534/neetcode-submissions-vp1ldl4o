class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int[] left = new int[nums.length];
        int[] right= new int[nums.length];
        for(int i =0; i < nums.length; i++){
            left[i] = leftProduct;
            leftProduct *= nums[i];

            right[nums.length-1-i] = rightProduct;
            rightProduct *= nums[nums.length-1-i];
        
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}  
