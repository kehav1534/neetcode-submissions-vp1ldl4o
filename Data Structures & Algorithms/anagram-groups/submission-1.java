class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> per = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i: strs){
            char[] temp = i.toCharArray();
            Arrays.sort(temp);
            if(map.containsKey(new String(temp))){
                map.get(new String(temp)).add(i);
            }
            else{
                List<String> tmp = new ArrayList<>();
                tmp.add(i);
                map.put(new String(temp), tmp);
            }
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            per.add(entry.getValue());
        }
        return per;
    }

}