class Solution {
    int i = 0;
    public String decodeString(String s) {
        String result = "";
        int num = 0;
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9')  
                num = num*10 + s.charAt(i)-'0';
            else if(s.charAt(i)=='['){
                i++;
                String temp = decodeString(s);
                result += multiple(temp, num);
                num=0;
            }
            else if(s.charAt(i)==']') return result;
            else result+=s.charAt(i);
            i++;
        }
        return result;
    }
    String multiple(String res, int rep){
        if(rep<=1) return res;
        return res+multiple(res, rep-1);
    }
}