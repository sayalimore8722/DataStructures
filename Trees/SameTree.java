/*
Given two binary trees, write a function to check if they are equal or not.
Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        boolean flag = false;
        TreeNode current1 = null, current2 = null;
        
        current1 = p;
        current2 = q;
        
        if(p == null && q == null)
        {
            return true;
        }
        else
        {
        stack1.push(current1);
        stack2.push(current2);
        
        
        while((!stack1.isEmpty() && !stack2.isEmpty()) && (current1!=null && current2!=null))
        {
        
          current1 = stack1.pop();
          current2 = stack2.pop();
            
        if(current1.val == current2.val)
        {
            
         if((current1.left == null && current1.right == null) && (current2.left == null && current2.right == null))
         {
             System.out.println("We both are null");
             flag = true;
         }
        
         if(current1.right != null && current2.right != null)
         {
            if((current1.right).val == (current2.right).val)
            {
                stack1.push(current1.right);
                stack2.push(current2.right);
                flag = true;
            }
             else
             {
                 flag = false;
                 return flag;
             }
         }
        else if(current1.right == null && current2.right == null)
        {
          flag = true;;
        }
        else if((current1.right != null && current2.right == null) || (current1.right == null && current2.right != null))
        {
            return false;
        }
            
         if(current1.left != null && current2.left != null)
         {
            if((current1.left).val == (current2.left).val)
            {
                stack1.push(current1.left);
                stack2.push(current2.left);
                flag = true;
            }
             else
             {
                 flag = false;
                 return flag;
             }
         }
        else if(current1.left == null && current2.left == null)
        {
            flag = true;         
        }
            
        else if((current1.left != null && current2.left == null) || (current1.left == null && current2.left != null))
        {
            return false;
        }
        }
        }
        }
        return flag;
        
    }
}
