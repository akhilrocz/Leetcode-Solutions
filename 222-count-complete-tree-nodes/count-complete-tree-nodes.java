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

        if(root==null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int nodeCount=0;

        while(!queue.isEmpty()){
           TreeNode current = queue.poll();  
            nodeCount++;  //1

            if(current.left!=null){  
                queue.add(current.left);
            }

              if(current.right!=null){  // 3 6
                queue.add(current.right);
            }
        }

        return nodeCount;
    
    }
}