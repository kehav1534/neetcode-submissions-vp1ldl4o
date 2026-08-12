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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root, targetSum, 0);
    }
    public boolean path(TreeNode root, int target, int sum){
        if(root==null) return false;
        sum+=root.val;
        if(sum==target && root.left==null && root.right==null){
            return true;
        }
        return path(root.left, target, sum) || path(root.right, target, sum);
    }
}