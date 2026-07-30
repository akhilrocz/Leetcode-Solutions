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
    public int minDepth(TreeNode root) {
        //bfs

        if(root==null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int depth=1;

        while(!queue.isEmpty()){

            int size =queue.size();  //1

            for(int i=0;i<size;i++){

            TreeNode node = queue.poll();  //3. //9 //20

            if(node.left==null && node.right==null) return depth;

            if(node.left!=null){

                queue.offer(node.left); // [9]   //[null]
            }

            if(node.right!=null){
                queue.offer(node.right); // [9,20].  [null]
            }


            }

            depth++;

        }

        return depth;
    }
}