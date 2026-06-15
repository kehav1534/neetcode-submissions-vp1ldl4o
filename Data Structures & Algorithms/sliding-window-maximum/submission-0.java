// Here I am using double-ended queue. 
// using concept of monotonic-deque;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int[] res = new int[nums.length-k+1];
        for(int i = 0; i < nums.length; i++){
            // remove elements from queue having index out of the window.
            while(!d.isEmpty() && d.peekFirst() <= i-k){
                d.pollFirst();
            }
            // remove elemts smaller than the current elements(indexes).
            while(!d.isEmpty() && nums[d.peekLast()] <= nums[i]){
                d.pollLast();
            }
            // add the current index.
            d.offerLast(i);
            // add the highest element to the result array. 
            // we use peekFirst because in cas lets say queue already has 7.
            // and then we add 5, here 7 is highest but 5 will also be added to the list.
            // later when 7 is removed, 5 becomes the highest element.
            if(i-k+1>=0) res[i-k+1] = nums[d.peekFirst()];
        }
        return res;
    }
}
