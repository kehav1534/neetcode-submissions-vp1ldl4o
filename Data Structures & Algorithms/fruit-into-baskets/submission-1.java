class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int max = 0;
        int count = 0;
        for(int i = 0; i < fruits.length; i++){
            if(basket.containsKey(fruits[i])){
                basket.put(fruits[i], basket.get(fruits[i])+1);
                count++;
            }
            else{
                basket.put(fruits[i], 1);
                count++;
            }

            while(basket.size()>2){
                basket.put(fruits[left], basket.get(fruits[left])-1);
                count--;
                if(basket.get(fruits[left])==0){
                    basket.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}