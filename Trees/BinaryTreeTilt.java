/*
Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.

Example:
Input: 
         1
       /   \
      2     3
Output: 1
Explanation: 
Tilt of node 2 : 0
Tilt of node 3 : 0
Tilt of node 1 : |2-3| = 1
Tilt of binary tree : 0 + 0 + 1 = 1
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
    public int findTilt(TreeNode root) {
        Stack<TreeNode> first = new Stack<TreeNode>();
        Stack<TreeNode> second = new Stack<TreeNode>();
        HashMap<TreeNode,Integer> map = new HashMap<TreeNode,Integer>();
        int left_val = 0, right_val = 0, tilt = 0, sum = 0;
        
        TreeNode current = root;
        first.push(current);
        
        if(root == null)
            return 0;
        else if(root.left == null && root.right == null)
            return root.val;
        else
        {
        while(!first.isEmpty())
        {
            ArrayList<TreeNode> arr = new ArrayList<TreeNode>(); 
            current = first.pop();
            second.push(current);
            
            if(current.left != null)
            {
                first.push(current.left);
            }
            
            
            if(current.right != null)
            {
                first.push(current.right);
            }
            
        }
    while(!second.isEmpty())
    {
        sum = 0;
        left_val = 0;
        right_val = 0;
        current = second.pop();
        System.out.println(current.val);
        
        if(current.left!=null)
        {
            if(map.get(current.left) != null)
                left_val = map.get(current.left);
            else
                left_val = (current.left).val;
        }
        
       if(current.right!=null)
       {
            if(map.get(current.right) != null)
                right_val = map.get(current.right);
            else
                right_val = (current.right).val;
       }
        
        System.out.println("Left : " + left_val);
        System.out.println("Right : " + right_val);
        
        sum = left_val + right_val + current.val;
        if(map.get(current) == null)
        {
            map.put(current, sum);
        }
            
        tilt = tilt + Math.abs(left_val - right_val);
           
        System.out.println("Tilt : "+tilt);
        System.out.println("Sum : "+sum);
    }
    }
    return tilt;
    }
}
