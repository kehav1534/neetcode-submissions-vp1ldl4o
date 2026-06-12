class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int slow = 0;
        int res = 0;
        int max = 0;
        for(int i = 0; i < fruits.length; i++){
            if(map.containsKey(fruits[i])){
                map.put(fruits[i], map.get(fruits[i])+1);
            }
            else{
                map.put(fruits[i], 1);
            }
            res++;
            while( map.size()>2){
                map.put(fruits[slow],  map.get(fruits[slow])-1);
                if(map.get(fruits[slow])<=0) map.remove(fruits[slow]);
                slow++;
                res--;
            }
            max = Math.max(res, max);
        }
        return max;
    }
}