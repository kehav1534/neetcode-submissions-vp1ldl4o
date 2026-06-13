class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int ptr = -1;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr=='('||curr=='{'|| curr=='['){
                stack[++ptr] = curr;
            }
            else if(ptr>=0 && ((curr==')'&& stack[ptr]=='(')||(curr=='}' && stack[ptr]=='{')||(curr==']' && stack[ptr]=='[')))
                ptr--;
            else return false;
        }
        if(ptr<0) return true;
        return false;
    }
}
