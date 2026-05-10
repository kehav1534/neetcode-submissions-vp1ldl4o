class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> main = new ArrayList<>();
        recursive(nums, 0, new ArrayList<Integer>(), main);
        return main;
        
    }
    public void recursive(int[] nums, int i, List<Integer> sub, List<List<Integer>> main){
        if(i>=nums.length){
            main.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        recursive(nums, i+1,sub, main);
        sub.removeLast();
        recursive(nums, i+1, sub, main);
    }
}
