class KthLargest {
    PriorityQueue<Integer> pq;
    private int p = 0;
    public KthLargest(int k, int[] nums) {
        this.p=k;
        pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            if(pq.size()<p)
                pq.add(nums[i]);
            else{
                if(pq.peek()<nums[i]){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()<this.p){
            pq.add(val);
        }
        else{
            if(pq.peek()<val){
                pq.poll();
                pq.add(val);
            }
        }
        return pq.peek();
        
    }
}
