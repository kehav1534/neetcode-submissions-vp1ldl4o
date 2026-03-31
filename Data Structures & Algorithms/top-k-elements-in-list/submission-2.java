class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i], map.get(nums[i])+1);
            }
            else
                map.put(nums[i], 1);
        }
        int [] arr = new int[k];
        int ptr = -1;
        PriorityQueue<Integer> queue =
        new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(Map.Entry<Integer, Integer> itr: map.entrySet()){
            if(queue.size()<k)
                queue.add(itr.getKey());
            else{
                if(itr.getValue()>map.get(queue.peek())){
                    queue.poll();
                    queue.add(itr.getKey());
                }
            }
        }
        for(int i : queue){
            ptr++;
            arr[ptr] = i;
        }
        return arr;
    }
}
