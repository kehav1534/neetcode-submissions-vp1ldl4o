class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        // int zeroIndex = -1;
        int countZero = 0;
        
        for(int i:nums){
            if(i==0){
                countZero++;
            }
            if(countZero<=1){
                if(i!=0){
                    product*=i;
                }
            }
            else{
                break;
            }
        }
        if(countZero>1){
            Arrays.fill(nums, 0);
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(nums[i]!=0 && countZero==1){
                    nums[i] = 0;
                }
                else if(nums[i]==0){
                    nums[i] = product;
                }
                else{
                    nums[i] = product/nums[i];
                }
            }
        }
        return nums;
        

    }
}  
