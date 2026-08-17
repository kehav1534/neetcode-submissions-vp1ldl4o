class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0; i < gifts.length; i++){
            pq.add(gifts[i]);
        }
        int pileLeft = 0;
        while(k>0){
            pq.add((int)Math.sqrt(pq.poll()));
            System.out.println(pileLeft);
            k--;
        }
        while(pq.size()>0){
            pileLeft+=pq.poll();

        }
        return pileLeft;
    }
}