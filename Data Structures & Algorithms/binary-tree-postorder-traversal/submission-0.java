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
    public List<Integer> postorderTraversal(TreeNode root) {
        return PostOrder(root, new ArrayList<>());
    }
    public List<Integer> PostOrder(TreeNode node, List<Integer> list){
        if(node==null) return list;
        PostOrder(node.left, list);
        PostOrder(node.right, list);
        list.add(node.val);
        return list;
    }
}