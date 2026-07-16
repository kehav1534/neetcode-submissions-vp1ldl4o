class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                set.add(nums[i]);
            }
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(set);
        int temp = 1;
        for(int i = set.size(); i > 0; i--){
            if(q.poll()!=temp) return temp;
            temp++;
        }
        return temp;
            
        
    }
}