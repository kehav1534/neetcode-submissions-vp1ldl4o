class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while(left<=right){
            if( nums[left]==val && nums[right]!=val)
                {
                    nums[left++] = nums[right--];
                    count++;
                 }
            else if(nums[right]==val)
                right--;
            else if(nums[left]!= val)
                {left++;count++;}

        }
        return count;
    }
}