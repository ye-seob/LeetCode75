
class Solution {
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
   public List<Integer> rightSideView(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    if (root == null) return answer;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int level = queue.size();
        for (int i = 0; i < level; i++) {
            TreeNode currentNode = queue.poll();
            if (i == level - 1) {
                answer.add(currentNode.val);
            }
            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
    }

    return answer;
}

}