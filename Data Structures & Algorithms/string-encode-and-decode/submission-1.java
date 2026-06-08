class Solution {

    public String encode(List<String> strs) {
        String output =  "";
        if(strs.size()>0){
            for(String s:strs){
                output = output + s + "..|..";
            }
        }
        return output;
    }

    public List<String> decode(String str) {
        String[] temp = str.split("\\.\\.\\|\\.\\.", -1);
        for(String t: temp) System.out.println(t);
        List<String> output = new ArrayList<>(Arrays.asList(temp));
        output.remove(output.size()-1);
        return output;
    }
}
