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
    int count = 0;

    public int goodNodes(TreeNode root) {
        goodNode(root, root.val);
        return count;
    }
    public void goodNode(TreeNode root, int prev){
        if(root==null) return;

        if(root.val>=prev) count++;

        // return Math.max(goodNode(root.left, root.val)+1, goodNode(root.right, root.val)+1);
        if(root.val>=prev){
            prev = root.val;
        }
        goodNode(root.left, prev);
        goodNode(root.right, prev);

    }
}
