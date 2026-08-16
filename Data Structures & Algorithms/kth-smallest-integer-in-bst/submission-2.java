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
    int smallest = 0;
    TreeNode s = null;
    public int kthSmallest(TreeNode root, int k) {
        smallst(root, k);
        return s.val;
    }
    public void smallst(TreeNode root, int k){
        if(root==null) return ;
        if(s!=null )return;
        smallst(root.left, k);
        smallest++;
        if(k==smallest) s = root;

        smallst(root.right, k);
    }
}
