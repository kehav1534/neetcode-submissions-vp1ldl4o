class Solution {
    public int trap(int[] height) {
        int left = 1; 
        int right = height.length-2;
        int leftMax = height[left-1];
        int rightMax = height[right+1];
        int maxDrop = 0;
        while(left<=right){
            if(leftMax<= rightMax){
                maxDrop += Math.max(leftMax-height[left], 0);
                leftMax = Math.max(leftMax, height[left]);
                left++;
            }
            else{
                maxDrop += Math.max(rightMax-height[right], 0);
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }
        }
        return maxDrop;
    }
}
