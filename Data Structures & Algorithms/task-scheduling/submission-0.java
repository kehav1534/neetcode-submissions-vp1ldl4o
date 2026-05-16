class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        int maxFreq = 0;
        int maxCount = 0;
        for(int i = 0; i  < tasks.length; i++){
            map[tasks[i]-'A']++;
            if(map[tasks[i]-'A'] > maxFreq){
                maxFreq = map[tasks[i]-'A'] ;
                maxCount=1;
            }
            else if( map[tasks[i]-'A'] == maxFreq){
                maxCount++;
            }
        }
        return max( ((maxFreq - 1) * (n+1)) + maxCount, tasks.length);
    }
    int max(int a, int b){
        return a > b? a:b;
    }
}