class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();

        Map<String, List<String>> map  = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] toArr = strs[i].toCharArray();
            Arrays.sort(toArr);
            String toStr = Arrays.toString(toArr);
            
            if(map.containsKey(toStr)){
                List<String> temp = map.get(toStr);
                temp.add(strs[i]);
                // map.put(toStr, temp);
            }
            else{
                List<String> lst = new ArrayList<>();
                lst.add(strs[i]);
                map.put(toStr, lst);
            }
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            anagrams.add(entry.getValue());
        }
        return anagrams;
    }
}
