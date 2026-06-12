class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;
        int[] leftMaxArr = new int[height.length];
        int[] rightMaxArr = new int[height.length];

        for(int i = 0; i < height.length; i++){
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[height.length-1-i]);
            leftMaxArr[i] = leftMax;
            rightMaxArr[height.length-1-i] = rightMax;
        }
        for(int i = 1; i < height.length-1; i++){
            if(leftMaxArr[i] <= rightMaxArr[i]){
                res+= Math.max( leftMaxArr[i]-height[i], 0);
            }
            else{
                res+= Math.max( rightMaxArr[i]-height[i], 0);
            }
        }
        return res;
    }
}


// Brute Force Approach..

// Here, we're calculating left most Max (including current index)-> leftMaxArr
// Here, we're calculating right most Max (including current index)-> rightMaxArr.
// Now moving from sencd index -> i = 1, check which leftMaxArr[i] or rightMaxArr[i] is smaller, which tells 
// maximum amount of water which can be filled.
// This will allow calculating fillable water with respect to current height.
// 



