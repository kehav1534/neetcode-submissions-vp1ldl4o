//Approch relatively complex...
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                int inc = map.get(i);
                map.put(i, ++inc);
            }
            else{
                map.put(i, 1);
            }
        }
        int key=0;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;
    }
}