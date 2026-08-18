class Solution {
    public int[] searchRange(int[] nums, int target) {
        return findElement(nums, target, 0, nums.length-1);
    }

    int[] findElement(int[] nums, int target, int s, int e){
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
                int[] left = findElement(nums, target, s, mid-1);
                int[] right = findElement(nums, target, mid+1, e);
                int l = -1;
                if(left[0]!=-1 && left[0]<mid){
                    l = left[0];
                }
                else l = mid;
                int r = -1;
                if(right[1]>mid) r = right[1];
                else r = mid;
                return new int[]{l, r};
            }
            if(nums[mid]<target)
                s = mid+1;
            else
                e  = mid-1;
        }
        return new int[] { -1, -1};
    }
}