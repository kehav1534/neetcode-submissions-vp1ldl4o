class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        String output = "";
        while(i>=0 && j>=0){
            int sum = (a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
            output = (sum%2)+output;
            carry = sum / 2;
            i--; j--;
        }
        while(i>=0){
            int sum = (a.charAt(i)-'0')+carry;
            output = (sum%2)+output;
            carry = sum/2;
            i--;
        }
        while(j>=0){
            int sum = (b.charAt(j)-'0')+carry;
            output = (sum%2)+output;
            carry = sum/2;
            j--;
        }
        if(carry>0)
            output = carry+output;
        return output;
    }
}