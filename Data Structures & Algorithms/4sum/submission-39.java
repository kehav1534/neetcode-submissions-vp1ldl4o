class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            // if((nums[i]>target && target > 0)) break;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j]==nums[j-1] && j-1 > i) continue;
                // if(nums[i]+nums[j]>target && target > 0) break;
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if(sum==target){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        if(!res.contains(temp)){
                            res.add(temp);     
                        }
                        left++;
                    }
                    else if(sum < target) left++;
                    else right--;
                }
            }
        }
        return res;
    }
}