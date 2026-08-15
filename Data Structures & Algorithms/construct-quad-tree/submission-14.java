
class Solution {
    public Node construct(int[][] grid) {
        return quad(grid, 0, grid.length-1, 0, grid[0].length-1, 1);
    }

    public Node quad(int[][] grid, int x1, int x2, int y1, int y2, int n){
        if(x1-x2==0 &&  y1-y2==0){
            if(grid[x1][y1]==1) return new Node(true, true);
            return new Node(false, true);
        }
        Node q1 = quad(grid, x1, (x1+x2)/2, y1, (y1+y2)/2, 1);
        Node q2 = quad(grid, x1, (x1+x2)/2, ((y1+y2)/2)+1, y2, 2);
        Node q3 = quad(grid, ((x1+x2)/2 )+1, x2, y1, (y1+y2)/2, 3);
        Node q4 = quad(grid, ((x1+x2)/2) +1, x2, ((y1+y2)/2)+1, y2, 4);
        if(q1.isLeaf && q2.isLeaf && q3.isLeaf && q4.isLeaf && q1.val==q2.val && q2.val==q3.val && q3.val==q4.val){
            return new Node(q1.val, true);
        }
        else{
            return new Node(q1.val, false, q1, q2, q3, q4);
        } 

    }
}