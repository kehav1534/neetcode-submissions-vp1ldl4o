class Solution {
    public int removeElement(int[] nums, int val) {
        int countOccur=0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if( nums[right] == val ){
                right--;
                countOccur++;
            }
            else if( nums[left] == val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
                ++countOccur;

            }
            else
                left++;
        }
        return nums.length-countOccur;
    }
}