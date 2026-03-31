class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ptrG = 0;
        int ptrS = 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(ptrG<g.length && ptrS < s.length){
            if( g[ptrG] <= s[ptrS]){
                count++;
                ptrG++;
                ptrS++;
            }
            else{
                ptrS++;
            }
        }
        return count;
    }
}