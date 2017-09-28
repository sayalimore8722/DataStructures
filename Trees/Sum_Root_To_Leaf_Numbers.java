/*
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
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
    public int sumNumbers(TreeNode root) {
     Stack<TreeNode> nodes = new Stack<TreeNode>();
     Stack<String> paths = new Stack<String>();
     TreeNode current = root;
     String root_leaf = " ";
     int sum = 0;

     if(current == null)
         return 0;
     else if(current.left == null && current.right == null)
         return current.val;
     else
     {
     nodes.push(current);
     paths.push(Integer.toString(current.val));
  
     while(!nodes.isEmpty())
     {
         current = nodes.pop();
         root_leaf = paths.pop();
         
         if(current.left == null && current.right == null)
         {
             sum = sum + Integer.parseInt(root_leaf);
         }
         
         if(current.right != null)
         {
             nodes.push(current.right);
             paths.push(root_leaf.concat(Integer.toString((current.right).val)));
         }
         
         if(current.left != null)
         {
             nodes.push(current.left);
             paths.push(root_leaf.concat(Integer.toString((current.left).val)));
         }
             
     }
     }
        return sum;
    }
}
