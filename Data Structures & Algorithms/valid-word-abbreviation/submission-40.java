class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int num = 0;
        int wordPtr = 0;
        for(int i = 0; i < abbr.length() ; i++){
            //here if 0 i != 0 and 0 in abbr comes before... automatically becomes invalid string.
            if(i > 0 && abbr.charAt(i)=='0' && (abbr.charAt(i-1)<'0' || abbr.charAt(i-1) >  '9' || i==0))
                return false;
            //if number comes in abbrivation add to the number.
            if(abbr.charAt(i) >= '0' && abbr.charAt(i)<= '9'){
                num = num*10 + ( abbr.charAt(i) - '0' );
            }
            // if the excracted number exist and a non-number comes, add num to 
            // wordPtr which is a pointer for word.
            // now make num = 0;
            else if(num > 0 && ( abbr.charAt(i) < '0' || abbr.charAt(i) > '9')){
                wordPtr+=num;
                num = 0;
                // checks if word ptr is not going greater than word length and the
                // char at a index is same in both.
                // if true just increase the wordPtr.
                // else return false.
                if(wordPtr< word.length() && abbr.charAt(i)==word.charAt(wordPtr))
                    wordPtr++;
                else
                    return false;
            }
            else if(abbr.charAt(i)==word.charAt(wordPtr))
                wordPtr++;
            else{
                return false;}
        }
        // incase the last char in abbr was number, need to handle it
        // if num exist add it to ptr.
        if(num>0) wordPtr+=num;
        // if wordPtr not same as word length return false;
        if(wordPtr!=word.length()) return false;
        return true;
    }
}