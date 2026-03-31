class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length>1){
            PriorityQueue<Integer> queue = new PriorityQueue<>(1, (a, b)->b-a);
            for(int i : stones){
                queue.add(i);
            }
            while(queue.size()>1){
                int a = queue.poll();
                int b = queue.poll();
                
                if(a-b>0){
                    queue.add(a-b);
                }
            }
            return queue.size()>0?queue.peek():0;
        }
        else return stones[0];
    }
}
