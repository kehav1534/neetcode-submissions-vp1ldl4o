class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        for(int i = 0; i<nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        int i = 0;
        while(i < k/2){
            int temp = nums[i];
            nums[i] = nums[k-1-i];
            nums[k-1-i] = temp;
            i++;
        }
        i = k;
        int l = nums.length-1;
        while(i<(k+nums.length)/2 && i < l){
            int temp = nums[i];
            nums[i] = nums[l];
            nums[l] = temp;
            i++; l--;
        }
    }
}