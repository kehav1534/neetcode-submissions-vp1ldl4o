class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int[] sqr = new int[nums.length];
        int i = nums.length-1;
        while(start <= end && i >= 0){
            int f = nums[start]*nums[start];
            int e = nums[end]*nums[end];
            if(f >= e){
                sqr[i--] = f;
                start++;
            }
            else if(e > f){
                sqr[i--] = e;
                end--;
            }
        }
        return sqr;
    }
}