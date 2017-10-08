/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
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
    public boolean hasPathSum(TreeNode root, int sum) {
        Stack<Integer> node_sum = new Stack<Integer>();
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        TreeNode current = root;
        int node_sumval = 0;
        
        if(current == null)
            return false;
        else
        {
        nodes.push(current);
        node_sum.push(current.val);
        
        while(!nodes.isEmpty())
        {
            current = nodes.pop();
            node_sumval = node_sum.pop();
            
            if(current.left == null && current.right == null)
            {
                if(node_sumval == sum)
                    return true;
            }
            else
            {
                if(current.right != null)
                {
                    nodes.push(current.right);
                    node_sum.push(node_sumval+((current.right).val));
                }
                if(current.left != null)
                {
                    nodes.push(current.left);
                    node_sum.push(node_sumval+((current.left).val));
                }
            }
        }
        }
        return false;
    }
}
