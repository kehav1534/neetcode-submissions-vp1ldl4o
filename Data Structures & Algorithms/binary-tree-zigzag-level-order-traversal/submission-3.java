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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> temp = new ArrayList<>();
        temp.add(root);
        leftToRight(result, temp);
        return result;
    }

    public void leftToRight(List<List<Integer>> res, List<TreeNode> cur){
        if(cur.size()==0) return;
        List<TreeNode> temp = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        for(TreeNode node: cur){
            lst.add(node.val);
            if(node.left!=null){
                temp.add(0, node.left);
            }
            if(node.right!=null) temp.add(0, node.right);
        }
        res.add(lst);
        rightToLeft(res, temp);
    }
    public void rightToLeft(List<List<Integer>> res, List<TreeNode> cur){
        if(cur.size()==0) return;
        
        List<TreeNode> temp = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        for(TreeNode node: cur){
            lst.add(node.val);
            if(node.right!=null){
                temp.add(0, node.right);
            }
            if(node.left!=null) temp.add(0, node.left);
        }
        res.add(lst);
        leftToRight(res, temp);
    }
}