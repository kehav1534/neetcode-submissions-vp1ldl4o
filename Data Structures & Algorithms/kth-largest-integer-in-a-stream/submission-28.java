class KthLargest {
    public PriorityQueue<Integer> queue;
    public int size;
    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>(k, (a,b)-> a-b);
        size = k;
        for(int i:nums){
            add(i);
        }
    }
    
    public int add(int val) {
        if(queue.size()<size)
            queue.add(val);
        else if(queue.size()>=size && val >= queue.peek()){
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}
