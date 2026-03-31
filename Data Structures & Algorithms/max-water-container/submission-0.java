class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int area = 0;
        while(left<right){
            int b = right-left;
            area = (b*min(heights[left],heights[right])>area)? b*min(heights[left], heights[right]): area;
            if(heights[left]<=heights[right])
                left++;
            else
                right--;
        }
        return area;
    }
    int min(int x, int y){
        return x<=y?x:y;
    }
}
