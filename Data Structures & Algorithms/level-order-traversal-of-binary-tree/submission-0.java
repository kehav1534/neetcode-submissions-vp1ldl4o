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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<TreeNode>> levelNode = new ArrayList<>();
        if(root==null) return new ArrayList<>();
        List<TreeNode> tmp = new ArrayList<>();
        tmp.add(root);
        levelNode.add(tmp);
        return BinaryTraversal(levelNode, new ArrayList<>());
    }

    public List<List<Integer>> BinaryTraversal(List<List<TreeNode>> nodeList, List<List<Integer>> valList){
        if(nodeList.size()==0) return valList;
        List<Integer> temp = new ArrayList<>();
        List<TreeNode> tempNodes = new ArrayList<>();
        for(TreeNode nodes: nodeList.remove(0)){
            temp.add(nodes.val);
            if(nodes.left!=null) tempNodes.add(nodes.left);
            if(nodes.right!=null) tempNodes.add(nodes.right);
        }
        valList.add(temp);
        if(tempNodes.size()>0) nodeList.add(tempNodes);
        return BinaryTraversal(nodeList, valList);
    }
}
