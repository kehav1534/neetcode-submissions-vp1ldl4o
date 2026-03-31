class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ptrG = 0;
        int ptrS = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(ptrG<g.length && ptrS < s.length){
            if( g[ptrG] <= s[ptrS]){
                ptrG++;
                ptrS++;
            }
            else{
                ptrS++;
            }
        }
        return ptrG;
    }
}