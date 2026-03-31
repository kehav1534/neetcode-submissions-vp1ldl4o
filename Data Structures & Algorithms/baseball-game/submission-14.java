class Solution {
    public int calPoints(String[] operations) {
        int ptr = -1;
        int move = 0;
        int[] stack = new int[operations.length];  //optional to use.
        while(move<operations.length){
            if(operations[move].charAt(0)=='C'){
                if(ptr>=0){
                    ptr--;
                }
                move++;
            }
            else if(operations[move].charAt(0)=='D' && ptr>=0){
                stack[++ptr] = (stack[ptr-1])*2;
                move++;
            }
            else if(operations[move].charAt(0)=='+'&&ptr>=0){
                stack[++ptr] = stack[ptr-1];
                System.out.println("ptr-1 : "+stack[ptr-1]);
                System.out.println("ptr-2: "+stack[ptr-2]);


                stack[ptr]+= (ptr-2>=0)?stack[ptr-2]:0;
                move++;
            }
            else{
                stack[++ptr] = convertToInt(operations[move]);
                System.out.println("> "+convertToInt(operations[move])+" < ");
                move++;
            }
            for(int i: stack){
                System.out.print(i+" ");
            }
                System.out.println();

        }
        int sum = 0;
        while(ptr>=0){
            sum+=stack[ptr--];
        }
        return sum;
    }
    public int convertToInt(String num){
        if(num.length()==1){
            return num.charAt(0)-'0';
        }
        boolean isNegative = false;
        int n = 0;
        for(int i = 0; i< num.length();i++){
            if(num.charAt(i)=='-')
                isNegative = true;
            else{
                n = n * 10 + (num.charAt(i)-'0');
            }
        }
        if(isNegative){
            return -n;
        }
        return n;
    }
}