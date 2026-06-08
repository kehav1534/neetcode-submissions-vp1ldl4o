class Solution {
    int kth;
    public int kthSmallest(TreeNode root, int k) {
        kth = k;
        return smallest(root).val;
    }
    public TreeNode smallest(TreeNode node){
        if(node==null) return null;
        TreeNode left = smallest(node.left);
        return left!=null? left : (--kth==0) ? node : smallest(node.right);
    }
}
