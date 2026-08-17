class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0; i < stones.length; i++){
            p.add(stones[i]);
        }
        while(p.size()>1){
            int h1 = p.poll();
            int h2 = p.poll();
            if(h1==h2) continue;
            else{
                if(h2 < h1){
                    p.add(h1-h2);
                }
            }
        }
        if(!p.isEmpty()) return p.poll();
        return 0;
    }
}
