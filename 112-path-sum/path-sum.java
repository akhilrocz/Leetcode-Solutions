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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        TreeNode current = root;
        if (current == null)
            return false;

        if (current.left == null && current.right == null) {
            return current.val == targetSum;
        }
       
        int remainingSum=targetSum-current.val;

        return hasPathSum(root.left,remainingSum)||hasPathSum(root.right,remainingSum);
    }
}