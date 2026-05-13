

class Solution {
    public int goodNodes(TreeNode root) {
        return DFS(root, -10001, 0);
    }



    public int DFS(TreeNode root, int max,  int count){
        if(root==null) return 0;
        if(root.val >= max){
            max = root.val;
            count++;
        }
        return DFS(root.left, max, 0) + count + DFS(root.right, max, 0);
    }
}