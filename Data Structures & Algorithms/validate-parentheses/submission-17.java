class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        
        int move = 0;
        int ptr = -1;

        while(move<s.length()){
            char cur = s.charAt(move);
            if(ptr>=0){
                if((cur=='}' && stack[ptr]=='{')||(cur==')' && stack[ptr]=='(')
                ||(cur==']' && stack[ptr]=='[')){
                    ptr--;
                }
                else{
                    stack[++ptr] = cur;
                }
            }
            else{
                stack[++ptr] = cur;
            }
            move++;
        }
        
        return ptr>=0?false:true;
    }
}
