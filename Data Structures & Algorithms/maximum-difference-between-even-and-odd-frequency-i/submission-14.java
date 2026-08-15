class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(Map.Entry<Character, Integer> mp: map.entrySet()){
            if(mp.getValue()%2==0){
                min = Math.min(min, mp.getValue());
            }
            else{
                max = Math.max(max, mp.getValue());
            }
        }
        return max-min;
    }
}