class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        return paths(obstacleGrid, 0, 0, dp);
    }

    public int paths(int[][] grid, int x, int y, int[][] dp){
        if(x == grid.length ||  y==grid[x].length) return 0;
        if(grid[x][y]==1 || dp[x][y]==-1) return 0;
        if (dp[x][y] > 0) return dp[x][y];
        if(x==grid.length-1 && y == grid[x].length-1){
            dp[x][y] = 1;
            return 1;
        };
        
        int right = paths(grid, x+1, y, dp);
        int down = paths(grid, x, y+1, dp);
        if(right+down==0) 
            dp[x][y] = -1;
        else
            dp[x][y] = right+down;
        return right+down;
    }
}