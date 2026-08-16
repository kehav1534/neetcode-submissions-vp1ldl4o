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
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root, key);
    }

    public TreeNode delete(TreeNode root, int key){
        if(root == null) return null;
        if(root.val==key){
            if(root.left!=null){
                TreeNode curr_right = root.right;
                insert(root.left, curr_right);
                return root.left;
            }
            else if(root.right!=null){
                TreeNode curr_left = root.left;
                insert(root.right, curr_left);
                return root.right;
            }
            else{
                return null;
            }
        }
        else{
            root.left = delete(root.left, key);
            root.right =  delete(root.right, key);
            return root;
        }
    }
    public void insert(TreeNode root, TreeNode toInsert){
        if(toInsert==null) return;
        if(root.val<toInsert.val && root.right==null){
            root.right= toInsert;
            return;
        }
        else if(root.val>toInsert.val && root.left==null){
            root.left= toInsert;
        }
        if(root.val<toInsert.val){
            insert(root.right, toInsert);
        }
        else if(root.val>toInsert.val){
            insert(root.left, toInsert);
        }
    }
    
}