class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        rec(list, target, nums, 0, 0, new ArrayList<>());
        return list;
    }
    public void rec(List<List<Integer>> list, int target, int[] nums, int idx, int sum, List<Integer> sub){
        if(idx>=nums.length || sum  > target)
            return;
        
        if(sum==target){
            list.add(new ArrayList<>(sub));
            return;
        }

        for(int j = idx ; j < nums.length; j++){
            if(j > idx && nums[j]==nums[j-1]) continue;
            if(nums[j]>target) break;
            sub.add(nums[j]);
            rec(list, target, nums, j, sum+nums[j], sub);
            sub.removeLast();
        }
        return;
    }
}
