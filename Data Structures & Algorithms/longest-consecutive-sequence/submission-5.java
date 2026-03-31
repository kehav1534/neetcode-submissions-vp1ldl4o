class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hash.add(nums[i]);
        }
        int count = 0;
        for(int num: nums){
            if(!hash.contains(num-1)){
                int n = num ;
                int tempCount = 1;

                while(hash.contains(n+1))
                {
                    tempCount++;
                    n++;
                }
                count = tempCount > count ? tempCount : count;
            }

        }

        return count;
    }
}
