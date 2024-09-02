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

    public int DFS(TreeNode node){
        if(node == null) return 0;

        int leftNum = DFS(node.left);
        int rightNum = DFS(node.right);

        return Math.max(leftNum,rightNum) + 1;
    }
   public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return DFS(root);
    }
}
