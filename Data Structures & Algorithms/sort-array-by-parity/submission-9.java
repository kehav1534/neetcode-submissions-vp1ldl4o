class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = -1;
        int right = nums.length;
        System.out.println(nums.length);
        while(left+1<right-1 && left < nums.length && right>=0){
            if(nums[left+1]%2==0)
                left++;
            else if(nums[right-1]%2==1)
                right--;
            else if(nums[left+1]%2==1 && nums[right-1]%2==0 ){
                int temp = nums[left+1];
                nums[left+1] = nums[right-1];
                nums[right-1] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}