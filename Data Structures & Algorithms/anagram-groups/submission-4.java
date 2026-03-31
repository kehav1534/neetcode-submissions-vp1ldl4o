class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word: strs){
            char[] temp = word.toCharArray();
            Arrays.sort(temp);
            String sortedWord = Arrays.toString(temp);
            if(map.containsKey(sortedWord)){
                map.get(sortedWord).add(word);
            }
            else{
                List<String> tmpList  = new ArrayList<>();
                tmpList.add(word);
                map.put(sortedWord, tmpList);
            }
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
