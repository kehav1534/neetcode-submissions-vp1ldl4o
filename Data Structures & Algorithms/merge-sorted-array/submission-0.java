class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i< n; i++){
            int l = (nums1.length-1-n+i);
            if(l>=0){
                    while(nums1[l]>nums2[i] && l >=0){
                    nums1[l+1] = nums1[l];
                    l--;
                    if(l<0)break;
                }
            }
            nums1[l+1] = nums2[i];

        }
    }
}