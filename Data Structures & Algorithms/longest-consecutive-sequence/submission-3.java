class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int tempCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(i==0) tempCount++;
            else if(i > 0 && nums[i]-nums[i-1]==1)
                tempCount++;
            else if(i > 0 && nums[i]-nums[i-1]==0);
            else{ 
                System.out.println(nums[i]);
                count = tempCount > count ? tempCount: count;
                tempCount = 1;
                }
        }
        count = tempCount > count ? tempCount: count;
        
        return count;
    }
}
