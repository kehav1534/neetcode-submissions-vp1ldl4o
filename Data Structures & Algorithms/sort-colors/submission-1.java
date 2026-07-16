class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(count[k] > 0){
                nums[i] = k;
                count[k]--;
            }
            if(count[k] <= 0) k++;
        }
        
    }
}