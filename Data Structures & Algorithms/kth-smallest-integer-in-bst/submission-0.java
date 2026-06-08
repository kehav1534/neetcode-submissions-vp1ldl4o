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
    int kth;
    public int kthSmallest(TreeNode root, int k) {
        kth = k;
        TreeNode sm = smallest(root);
        return sm.val;
    }
    public TreeNode smallest(TreeNode node){
        if(node==null) return null;
        TreeNode left = smallest(node.left);
        return left!=null? left : (--kth==0) ? node : smallest(node.right);
    }
}
