package Trees;

import java.util.ArrayList;

public class BinarySearchTree {
	
	BinarySearchTree left,right,current_node,parent,root;
	int data, top;
	public BinarySearchTree[] stack = new BinarySearchTree[50]; 
	
	public BinarySearchTree()
	{
		top = -1;
	}
	
	public BinarySearchTree(int data)
	{
		this.data = data;
		left = right = null;
	}
	
	public void push(BinarySearchTree element)
	{
		stack[++top] = element;
	}
	
	public BinarySearchTree pop()
	{
		return stack[top--];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public BinarySearchTree insert(int data)
	{
		BinarySearchTree newNode = new BinarySearchTree(data);
		
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			current_node = root;
			
			while(true)
			{
			parent = current_node;
			if(data<current_node.data)
			{
				current_node = current_node.left;
				if(current_node == null)
				{
					parent.left = newNode;
					break;
				}
			}
			else
			{
				current_node = current_node.right;
				if(current_node == null)
				{
					parent.right = newNode;
					break;
				}
			}
			}
			
		}
		return root;
	}
	public void inOrderTraverseTree(BinarySearchTree focusNode) {
		        if (focusNode != null) {
		      
		        	inOrderTraverseTree(focusNode.left);
		            System.out.println(focusNode.data);
		            inOrderTraverseTree(focusNode.right);
		
		        }
	}
		        
	public int sum_leaves(BinarySearchTree root)
	{
		int result = 0;
		BinarySearchTree current = root;
		
		while(!isEmpty() || current!=null)
		{
			if(current == null)
			{
				current = pop();
				System.out.println("Poped new : "+current.data);
				current = current.right;
			}
			else
			{
			if(current.left != null || current.right != null)
			{
				System.out.println("First"+current.data);
				push(current);
				current = current.left;
			}
			else if(current.left == null && current.right == null)
			{
				System.out.println("Second"+current.data);
				result = result + current.data;
				if(!isEmpty())
					current = pop();
				System.out.println("Poped 1 : "+current.data);
				current = current.right;
				
			}
			else if(current.left == null || current.right == null)
			{
				try
				{
				System.out.println("Third"+current.data);
				if(!isEmpty())
					current = pop();
				System.out.println("Poped 2 : "+current.data);
				current = current.right;
				}
				catch(Exception e)
				{
					continue;
				}
			}
			}
		}
		return result;
	}
	
}

package Trees;

public class Test_Tree {
	public static void main(String[] args)
	{
	BinarySearchTree b = new BinarySearchTree();
	
	b.insert(50);
	b.insert(25);
	b.insert(15);
	b.insert(30);
	b.insert(75);
	b.insert(85);
	b.insert(28);
	
	b.inOrderTraverseTree(b.root);
	System.out.println("---------------------------");
	int result = b.sum_leaves(b.root);
	System.out.println("Sum is : " + result);
	}
}
