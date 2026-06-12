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
// Here, I'm taking two max value at left and right most as : leftMax, rightMax.
// Now, compare which max value is shorter that will create fillable container.
// if we take leftMax, calculate the amount fillable at left which should be > 0.
//          leftMax = 5, height[left] = 9, rightMax = 8
//so here the bar is greater leftMax -> water cannot be filled
// update the leftMax which would be leftMax = height[left] and move left pointer.

// Basically, here the gretest Max doesn't matter, what matter is secont max bar in leftMax and rightMax to calculate the water it can hold.