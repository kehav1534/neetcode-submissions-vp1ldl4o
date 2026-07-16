class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        Set<Integer> out = new HashSet<>();

        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else map.put(nums[i], 1);

            if(map.get(nums[i]) > nums.length/3){
                out.add(nums[i]);
            }
        }

        return new ArrayList<>(out);
    }
}