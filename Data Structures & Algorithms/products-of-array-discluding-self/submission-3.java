class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                System.out.println(i);
                left[i] = left[i-1]*nums[i-1];
                right[nums.length-1-i] = nums[nums.length-i]*right[nums.length-i];
            }
            else{
                left[i] = 1;
                right[nums.length-1-i] = 1;
            }
        }


        for(int i = 0; i < nums.length; i++){
            nums[i] = left[i]*right[i];
        }
        return nums;
    }
}  
