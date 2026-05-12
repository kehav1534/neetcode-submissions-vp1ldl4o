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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        InOrder(list, root);
        return list;
    }

    public void InOrder(List<Integer> list, TreeNode node){
        if(node==null) return;
        
        InOrder(list, node.left);
        list.add(node.val);
        InOrder(list, node.right);
        return;
    }
}