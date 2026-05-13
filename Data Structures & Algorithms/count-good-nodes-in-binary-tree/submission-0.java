 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return DFS(root, -101, 0);
    }

    public int DFS(TreeNode root, int max,  int count){
        if(root==null) return 0;

        int left = 0;
        int right = 0;
        if(root.val >= max){
            max = root.val;
            count++;
        }
        left+= DFS(root.left, max, 0);
        right+= DFS(root.right, max, 0);
        return left + count + right;
    }
}