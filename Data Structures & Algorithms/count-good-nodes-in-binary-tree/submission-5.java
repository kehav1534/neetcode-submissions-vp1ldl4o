

class Solution {
    public int goodNodes(TreeNode root) {
        return DFS(root, -10001);
    }



    public int DFS(TreeNode root, int max){
        if(root==null) return 0;
        if(root.val >= max){
            max = root.val;
            return DFS(root.left, max) + 1 + DFS(root.right, max);
        }
        return DFS(root.left, max) + DFS(root.right, max);
    }
}