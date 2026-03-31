class Solution {
    public void moveZeroes(int[] nums) {
        int ptr = -1;
        int move = 0;
        while(move < nums.length){
            if(nums[move]!=0){
                nums[++ptr] = nums[move];
                if(ptr!=move)
                    nums[move] = 0;
            }
            move++;
        }
    }
}