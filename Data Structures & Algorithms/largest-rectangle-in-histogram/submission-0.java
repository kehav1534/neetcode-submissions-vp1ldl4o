class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for(int i = 0; i < heights.length; i++){
            max = Math.max(heights[i] , max);
            int min = heights[i];
            for(int j = i+1 ; j < heights.length; j++){
                min = Math.min(heights[j], min);
                max = Math.max(((j-i)+1)*min, max);
            }
        }
        return max;
    }
}
