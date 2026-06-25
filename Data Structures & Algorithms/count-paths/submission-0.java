class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return paths(0, 0, m, n, dp);
    }

    public int paths(int x, int y,  int m, int n, int[][] dp){
        if(x == m || y == n) return 0;
        if(x==m-1 && y == n-1 ){
            dp[x][y] = 1;
            return 1;
        }
        if(dp[x][y] > 0) return dp[x][y];
        
        int right = paths(x+1, y, m, n, dp);
        int down = paths(x, y+1, m, n, dp);
        dp[x][y] = right+down;
        return dp[x][y];
    }
}
