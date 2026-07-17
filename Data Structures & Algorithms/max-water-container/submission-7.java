class Solution {
    public int maxArea(int[] heights) {

        int max = 0;
        int l = 0;
        int r = heights.length-1;
        while( l< heights.length && l < r){
            int h = Math.min(heights[l], heights[r]);
            max = Math.max(max, h*(r-l));
            if(heights[l]<=heights[r]) l++;
            else r--;
        }
        return max;
    }
}
