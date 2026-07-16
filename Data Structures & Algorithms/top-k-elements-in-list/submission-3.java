class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])) 
                map.put(nums[i], map.get(nums[i])+1);
            else map.put(nums[i],1);

            if(q.size()<k && !q.contains(nums[i])){
                q.add(nums[i]);
            }
            else{
                if(q.contains(nums[i]))
                    q.remove(nums[i]);
                q.add(nums[i]);
                if(q.size()>k)
                    q.poll();
            }
        }
        int[] top = new int[q.size()];
        int i = 0;
        while(q.size()>0) top[i++] =  q.poll();
        return top;
    }
}
