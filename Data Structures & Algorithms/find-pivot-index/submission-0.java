class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0)return -1;
        int[] front = new int[nums.length];
        int[] reverse = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i==0){
                front[i] = nums[i];
                reverse[nums.length-1-i] = nums[nums.length-1-i];
            }
            else{
                front[i] = nums[i]+front[i-1];
                reverse[nums.length-1-i] = nums[nums.length-1-i]+reverse[nums.length-i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(front[i]==reverse[i]){
                return i;
            }
        }
        return -1;
    }
}