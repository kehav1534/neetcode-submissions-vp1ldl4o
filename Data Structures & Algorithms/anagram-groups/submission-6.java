class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
        List<List<String>> o = new ArrayList<>();
        for(HashMap.Entry<String, List<String>> e: map.entrySet()){
            o.add(e.getValue());
        }
        return o;
    }
}
