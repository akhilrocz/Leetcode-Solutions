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
    public int countNodes(TreeNode root) {

        //recursive solution
        //  if(root==null) return 0;
        
        // return 1+countNodes(root.left)+countNodes(root.right);

        //queue based approach

         if(root==null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();  //creating queue object

        queue.offer(root);

        int nodes=0;

        while(!queue.isEmpty()){
            TreeNode current =queue.poll();
            nodes++;

            if(current.left!=null){
                queue.add(current.left);
            }

            if(current.right!=null){
                queue.add(current.right);
            }
        }

        return nodes;

    }
}