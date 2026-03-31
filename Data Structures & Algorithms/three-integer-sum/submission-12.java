class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i< nums.length-2; i++){
            int right = nums.length-1;

            if(i>0 && nums[i]==nums[i-1])
                continue;
            int left = i+1;
            while(left<right){
                while(nums[left]==nums[left+1]&& (left+1)<right)
                    left++;
                while(nums[right]==nums[right-1] && (right-1)>left)
                    right--;
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0)
                    arr.add(Arrays.asList(nums[i], nums[left], nums[right]));
                else if(sum>0){
                    right--; 
                    continue;
                }
                else if(sum<0){
                    left++;
                    continue;}
                right--;
                left++;
            }
        }
        return arr;

    }
}