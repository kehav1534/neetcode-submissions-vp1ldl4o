class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return paths(grid, 0, 0, dp);
    }

    public int paths(int[][] grid, int x, int y, int[][] dp){
        
        if(x == grid.length || y == grid[x].length) return Integer.MAX_VALUE;
        if(x == grid.length-1 && y == grid[x].length-1){
            dp[x][y] = grid[x][y];
            return dp[x][y];
        }
        if(dp[x][y]!=0){
            return dp[x][y];
        }

        int right = paths(grid, x+1, y, dp);
        int down = paths(grid, x, y+1, dp);
        dp[x][y] = grid[x][y]+ Math.min(right, down);

        return dp[x][y];
    }
}