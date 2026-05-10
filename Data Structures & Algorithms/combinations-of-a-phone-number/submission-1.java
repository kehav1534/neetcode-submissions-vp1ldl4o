class Solution {
    Map<Character, String> combini = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.equals("")) return list;
        combini.put('2', "abc");
        combini.put('3', "def");
        combini.put('4', "ghi");
        combini.put('5', "jkl");
        combini.put('6', "mno");
        combini.put('7', "pqrs");
        combini.put('8', "tuv");
        combini.put('9', "wxyz");
        recursive(list, digits, "", 0);
        return list;
        
    }
    public void recursive(List<String> list, String input, String word, int i){
        if( i >= input.length()){
            list.add(word);
            return;
        }
        String numCom = combini.get(input.charAt(i));
        for(int j = 0; j < numCom.length() ; j++){
            recursive(list, input, word+numCom.charAt(j), i+1);
        }
    }
}