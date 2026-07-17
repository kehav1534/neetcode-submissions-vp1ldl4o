class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i), 1);
            }
        }

        for(int i = 0 ; i < s2.length(); i++){
            Map<Character, Integer> temp = new HashMap<>(map);

            for(int j = i; j < s2.length(); j++){
                if(temp.containsKey(s2.charAt(j))){
                    temp.put(s2.charAt(j), temp.get(s2.charAt(j))-1);

                    if(temp.get(s2.charAt(j))==0)
                        temp.remove(s2.charAt(j));
                    
                    if(temp.size()==0) return true;

                }
                else break;
            }
        }
        
        return false;
    }
}
