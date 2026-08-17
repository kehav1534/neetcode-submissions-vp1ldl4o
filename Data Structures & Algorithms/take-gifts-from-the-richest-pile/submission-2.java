class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a,b)->Long.compare(b,a));
        for(int i = 0; i < gifts.length; i++){
            pq.add((long)gifts[i]);
        }
        while(k>0){
            pq.add((long)Math.sqrt(pq.poll()));
            k--;
        }
        long pileLeft = 0;

        while(pq.size()>0){
            pileLeft+=pq.poll();
        }
        return pileLeft;
    }
}