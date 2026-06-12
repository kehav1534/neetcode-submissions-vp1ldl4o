//Optimized approach..

class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int left = 1;
        int right = height.length-2;
        int res = 0;
        while(left<=right){
            if(leftMax<=rightMax){
                res += Math.max(leftMax-height[left], 0);
                leftMax =  Math.max(leftMax, height[left]);
                left++;
            }
            else{
                res+= Math.max(rightMax-height[right], 0);
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }
        }
        return res;
    }
}
