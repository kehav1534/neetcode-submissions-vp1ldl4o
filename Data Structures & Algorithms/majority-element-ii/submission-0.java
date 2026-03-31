class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        int len= nums.length/3;
        for(int num: nums){
            if(map.containsKey(num)){
                map.replace(num, map.get(num)+1);
            }
            else
                map.put(num, 1);
            
            if(map.get(num)>len && !output.contains(num)){
                output.add(num);
            }
        }

        return output;
    }
}