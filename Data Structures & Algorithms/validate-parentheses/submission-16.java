class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        
        int move = 0;
        int ptr = -1;

        while(move<s.length()){
            if(ptr>=0){
                if(s.charAt(move)=='}' && stack[ptr]=='{'){
                    ptr--;
                }
                else if(s.charAt(move)==']' && stack[ptr]=='['){
                    ptr--;
                }
                else if(s.charAt(move)==')' && stack[ptr]=='('){
                    ptr--;
                }
                else{
                    stack[++ptr] = s.charAt(move);
                }
                
            }
            else{
                stack[++ptr] = s.charAt(move);
            }
            move++;
        }
        
        return ptr>=0?false:true;
    }
}
