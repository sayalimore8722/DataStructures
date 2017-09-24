/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        
        Stack<TreeNode> node_stack = new Stack<TreeNode>();
        Stack<Integer> val_stack = new Stack<Integer>();
        int depth = 0, max = 0;
        TreeNode current = null;
        if(root == null)
            return 0;
        else if(root.left == null && root.right == null)
            return 1;
        else
        {
        node_stack.push(root);
        val_stack.push(1);
        
        while(!node_stack.isEmpty())
        {
         current = node_stack.pop();
         depth = val_stack.pop();
            
         if(current.left == null && current.right == null)
         {
            max = Math.max(depth, max);
         }
         else
         {
             if(current.right != null)
             {
                 node_stack.push(current.right);
                 val_stack.push(depth+1);
             }
             
             if(current.left != null)
             {
                 node_stack.push(current.left);
                 val_stack.push(depth+1);
             }
         }
        }
        }
        return max;
    }
}
