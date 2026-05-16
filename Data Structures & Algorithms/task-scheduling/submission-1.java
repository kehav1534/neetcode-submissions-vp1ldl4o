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

// in this question, 
// we are trying to get the maxFrequency of what ever number and,
// maxCount for count of numbers having the same highest frquency.
// first we getting total serial combination the number having highest freq,
// X _ _ x _ _ X
// so here ((maxFreq - 1) * (n+1)) gets X _ _ X _ _ 
// to have last elments without adding nulls we are adding them
// thats why we are taking maxCount for total no. of numbers having the same highest frquency.
// then we just add those num to last.

// but some time we can have less numbers than total no. of elements, that's why we 
// return arr.length ;


