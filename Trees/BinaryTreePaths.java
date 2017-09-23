/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
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
    public List<String> binaryTreePaths(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        Stack<String> paths = new Stack<String>();
        
        List<String> all_paths = new ArrayList<String>();
        String root_leaf = " ";
        
        TreeNode current = null;
        if(root == null)
            return all_paths;
        else
        {
        nodes.push(root);
        paths.push(Integer.toString(root.val));
        
        while(!nodes.isEmpty())
        {
            current = nodes.pop();
            root_leaf = paths.pop();
            
            System.out.println("Current node : "+ current.val);
            System.out.println("Path : "+ root_leaf);

            if(current.left == null && current.right == null)
            {
                all_paths.add(root_leaf);
            }
            else
            {
                if(current.right != null)
                {
                    nodes.push(current.right);
                    paths.push(root_leaf.concat("->"+(Integer.toString((current.right).val))));
                }
                if(current.left != null)
                {
                    nodes.push(current.left);
                    paths.push(root_leaf.concat("->"+(Integer.toString((current.left).val))));
                }
            }
        }
        }
        return all_paths;
        
    }
}
