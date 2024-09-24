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
 * }1
 */
class Solution {
    public TreeNode findKey(TreeNode root, int key) {
    if (root == null) return root; 

    if (root.val == key) {
        if (root.left == null && root.right == null) {
            return null;
        }
        if(root.left != null &&  root.right == null ){
            return root.left;
        }
         if(root.left == null &&  root.right != null ){
            return root.right;
        }
         if(root.left != null &&  root.right != null ){
            return findMax(root.left);
        }
    }

    if (root.val > key) return findKey(root.left, key);
    return findKey(root.right, key);
}

    public TreeNode findMax(TreeNode root){
        if(root.right == null) return root;

        return findMax(root.right);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return findKey(root,key);
    }
}