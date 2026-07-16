class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        // int count = 0;
        int maxCount = 0;

        for(int i:nums){
            if(!set.contains(i-1)){
                int temp  = i;
                int count = 0;
                while(set.contains( temp )){
                    set.remove(temp);
                    temp++;
                    count++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }
}
