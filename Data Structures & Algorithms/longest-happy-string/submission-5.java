class Solution {
    public String longestDiverseString(int a, int b, int c) {
        String res = "";
        while(a>0||b>0||c>0){
            String sub = res.length()>=2?res.substring(res.length()-2, res.length()):"";

            if((a>=b && a >= c && !sub.equals("aa"))||
                ((sub.equals("bb")||sub.equals("cc"))&&a>0)){
                res+="a";
                a--;
            }
            else if((b>=a && b>=c &&  !sub.equals("bb"))||
                    (( sub.equals("aa")||sub.equals("cc")) && b>0) ){
                res+="b";
                b--;
            }
            else if((c>= a && c >= b && !sub.equals("cc"))||
                    ((sub.equals("bb")||sub.equals("aa"))&&c>0)){
                res+="c";
                c--;
            }
            
            sub = res.length()>=2?res.substring(res.length()-2, res.length()):"";
            if((a+b==0 && c > 0 && sub.equals("cc"))||
                (a+c==0 && b > 0 && sub.equals("bb"))||
                (c+b==0 && a > 0 && sub.equals("aa")))
                {
                break;
            }
        }
        return res;
    }
}