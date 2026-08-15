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
        int[] count = {0};
        goodNode(root, root.val, count);
        return count[0];
    }
    public void goodNode(TreeNode root, int prev, int[] count){
        if(root==null) return;
        if(root.val>=prev) count[0]++;
        if(root.val>=prev){
            prev = root.val;
        }
        goodNode(root.left, prev, count);
        goodNode(root.right, prev, count);

    }
}
