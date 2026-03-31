class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String i : details){
            int age = (i.charAt(11)-'0')*10 + (i.charAt(12)-'0');
            if(age > 60) count++;
        }
        return count;
    }
}