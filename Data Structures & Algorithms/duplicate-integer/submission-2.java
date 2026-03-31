class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        while(i< nums.length-1){
            j = i+1;
            while(j<nums.length){
                System.out.println(i+" "+j);
                if(nums[i]==nums[j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}