class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        while(left<right){
            int height= minHeight(heights[left], heights[right]) * (right - left);
            max = height > max ? height : max;
            if(heights[left] <= heights[right]){
                left++;
            }
            else right--;
            System.out.println(left + " "+ right);
        }
        return max;
    }
    public int minHeight(int a, int b){
        return a<=b ? a : b;
    }
}
