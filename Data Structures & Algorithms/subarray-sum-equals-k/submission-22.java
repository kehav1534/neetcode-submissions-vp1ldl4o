class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashSet<Integer[]> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            // List<Integer> arrList = new ArrayList<>();
            for(int j = i; j < nums.length; j++){
                sum+=nums[j];
                // arrList.add(nums[j]);
                if(sum==k){
                    // Integer[] list = new Integer[arrList.size()];
                    // list = arrList.toArray(new Integer[0]);
                    // set.add(list);
                    count++;
                }
            }
        }
        return count;
    }
}