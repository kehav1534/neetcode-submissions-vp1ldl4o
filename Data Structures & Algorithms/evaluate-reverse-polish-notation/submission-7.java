class Solution {
    public int evalRPN(String[] tokens) {
        int move = 0;
        int ptr = -1;
        int arrLen = tokens.length;
        int[] stack = new int[tokens.length];
        while(move < arrLen){
            if(tokens[move].equals("*")){
                stack[ptr-1] = stack[ptr]*stack[ptr-1];
                ptr--;
            }
            else if(tokens[move].equals("+")){
                stack[ptr-1] = stack[ptr]+stack[ptr-1];
                ptr--;
            }
            else if(tokens[move].equals("/")){
                stack[ptr-1] = stack[ptr-1] / stack[ptr];
                ptr--;
            }
            else if(tokens[move].equals("-")){
                stack[ptr-1] = stack[ptr-1] - stack[ptr];
                ptr--;
            }
            else{
                stack[++ptr] = stringToInt(tokens[move]);
            }
            move++;
            for(int k : stack){
                System.out.print(k+" ");

            }
            System.out.print("     ptr:  "+ptr);
            System.out.println();

            
        }
        return stack[0];
    }
    public int stringToInt(String num){
        boolean isNegative = false;
        int i = 0;
        int n = 0;
        while(i<num.length()){
            if(num.charAt(i)=='-'){
                isNegative = true;
                i++;
            }
            n = n * 10 + num.charAt(i)-'0';
            i++;
        }
        if(isNegative)
            n = -n;
        return n;
    }
}
