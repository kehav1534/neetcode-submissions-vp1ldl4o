class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer, List<Integer>> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
            for(int itr : map.get(nums[i])){
                if( i - itr <= k )
                    return true;
            }
            map.get(nums[i]).add(i);
        }
        else{
            List<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(nums[i], list);
        }
       }
       return false;
    }
}