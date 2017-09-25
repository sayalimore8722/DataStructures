/*
Given a binary tree, return the inorder traversal of its nodes' values.
For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2]
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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        List<Integer> inOrder = new ArrayList<Integer>();
        
        TreeNode current = root;
        if(root == null)
            return inOrder;
        else
        {
        while(current != null || !nodes.isEmpty())
        {
            if(current != null)
            {
                nodes.push(current);
                current = current.left;
            }
            else
            {
                if(!nodes.isEmpty())
                   current = nodes.pop();
                inOrder.add(current.val);
                current = current.right;
            }
        }
        }
        return inOrder;
    }
}
