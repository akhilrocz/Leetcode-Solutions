/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if (root == null)
            return output;
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode node = stk.pop();
            output.add(node.val);
            if (node.left != null) {
                stk.push(node.left);
            }

            if (node.right != null) {
                stk.push(node.right);
            }

        }
        Collections.reverse(output);
        return output;
    }
}