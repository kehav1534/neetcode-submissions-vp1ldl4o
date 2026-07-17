class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < nums.length; i++){
            q.addLast(nums[i]);
        }
        for(int i = k; i > 0; i--){
            q.addFirst(q.pollLast());
        }
        for(int i  = 0; i < nums.length; i++){
            nums[i] = q.pollFirst();
        }
    }
}