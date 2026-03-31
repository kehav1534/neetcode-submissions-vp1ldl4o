class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int num = 0;
        int wordPtr = 0;
        for(int i = 0; i < abbr.length() ; i++){
            if(i > 0 && abbr.charAt(i)=='0' && (abbr.charAt(i-1)<'0' || abbr.charAt(i-1) >  '9' || i==0))
                {System.out.println("here"); return false; }
            if(abbr.charAt(i) >= '0' && abbr.charAt(i)<= '9'){
                num = num*10 + ( abbr.charAt(i) - '0' );
            }
            else if(num > 0 && ( abbr.charAt(i) < '0' || abbr.charAt(i) > '9')){
                System.out.println(num); 

                wordPtr+=num;

                num = 0;
                if(wordPtr< word.length() && abbr.charAt(i)==word.charAt(wordPtr))
                    wordPtr++;
                else
                    return false;
            }
            else if(abbr.charAt(i)==word.charAt(wordPtr))
                wordPtr++;
            else{
                // System.out.println(num); 
                return false;}
        }
        if(num>0) wordPtr+=num;
        if(wordPtr!=word.length()) return false;
        return true;
    }
}