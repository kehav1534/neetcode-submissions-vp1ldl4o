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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<TreeNode>> nodeList = new ArrayList<>();
        List<TreeNode> tmp = new ArrayList<>();
        tmp.add(root);
        nodeList.add(tmp);
        return BFS(nodeList, new ArrayList<>());
    }
    public List<Integer> BFS(List<List<TreeNode>> nodeList, List<Integer> rightView){
        if(nodeList.size()==0) return rightView;
        List<TreeNode> tmp = nodeList.remove(0);
        List<TreeNode> newTemp = new ArrayList<>();
        TreeNode tNode = tmp.get(tmp.size()-1);
        if(tNode!=null)
            rightView.add( tNode.val );
        for(TreeNode node: tmp){
            if(node.left!=null) newTemp.add(node.left);
            if(node.right!=null) newTemp.add(node.right);
        }
        if(newTemp.size()>0) nodeList.add(newTemp);
        return BFS(nodeList, rightView);
    }
}
