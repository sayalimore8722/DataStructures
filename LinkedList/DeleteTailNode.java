/*
Problem Statement :
You’re given the pointer to the head node of a linked list and the position of a node to delete. Delete the node at the given 
position and return the head node. A positionof 0 indicates head, a position of 1 indicates one node away from the head and so on.
The list may become empty after you delete the node.
*/


public class NodeStructure {


	int value;
	NodeStructure next,head,temp;
	
	public NodeStructure()
	{	
		value=0;
		next=null;	
		head=null;
	}
	
	public NodeStructure createLinkedList(NodeStructure node,int data)
	{
		if(head==null)
		{
			System.out.println("I m creating");
			
			
			
			node.value=data;
			node.next=null;
			head=node;
			
		
			System.out.println("I have created");
		}
		
		return head; 
	}
	
	public void insertAtHead(NodeStructure node,int data)
	{
		if(head!=null)
		{
			temp=head;
			
			node.next=temp;
			node.value=data;
			
			head=node;
		}
	}
	
	public void insertAtTail(NodeStructure node,int data)
	{
		if(head!=null)
		{
			temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			node.next=null;
			node.value=data;
			
			temp.next=node;
		}
	}
	
	public void insertAtPosition(NodeStructure node,int data,int pos)
	{
		int counter=0;
		
		temp=head;
		
		while(counter!=(pos-1))
		{
			System.out.println("*****Counter : "+counter);
			counter++;
			temp=temp.next;
		}
		
		System.out.println("Counter : "+counter);
		System.out.println("Data : "+temp.value);
		
		node.next=temp.next;
		node.value=data;
		
		temp.next=node;
	}
	
	
	public void deleteNode(int pos)
	{
		int counter=0;
		
		temp=head;
		
		while(counter!=(pos-1))
		{
			counter++;
			temp=temp.next;
		}
		
		temp.next=(temp.next).next;
	}
	
	public void deleteNodeAtStart()
	{
		temp=head;
		
		head=temp.next;
	}
	
	public void deleteTailNode()
	{
		NodeStructure prevTemp=null; 
		
		temp=head;
		
		while(temp.next!=null)
		{
			prevTemp=temp;
			temp=temp.next;
		}
		
		prevTemp.next=null;
	}
	
	public void printLinkedList()
	{
		System.out.println("I m printing");
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		else
		{
			System.out.println("I m in else");
			temp=head;
			
			while(temp!=null)
			{
				System.out.println("In While");
				System.out.println(temp.value);
		
				temp=temp.next;
				
			}
			
		}
			
	}

}


public class DeleteTailNode {

	public static void main(String[] args) {
		
		System.out.println("*****************Creation**********************");
		
		System.out.println("Creating Linked List");
		NodeStructure node=new NodeStructure();
		NodeStructure n=node.createLinkedList(node,10);
		node.printLinkedList();
		
		System.out.println("*****************Insertion**********************");

		System.out.println("Inserting node at tail of Linked List");
		NodeStructure node1=new NodeStructure();
		node.insertAtTail(node1,20);
		node.printLinkedList();
		
		System.out.println("Inserting node at tail of Linked List");
		NodeStructure node2=new NodeStructure();
		node.insertAtTail(node2,30);
		node.printLinkedList();
		
		System.out.println("Inserting node at head of Linked List");
		NodeStructure node3=new NodeStructure();
		node.insertAtHead(node3,50);
		node.printLinkedList();
		
		System.out.println("Inserting node at specified position in Linked List");
		NodeStructure node4=new NodeStructure();
		node.insertAtPosition(node4,100,2);
		node.printLinkedList();
		
		System.out.println("*****************Deletion**********************");
		
		System.out.println("Deleting node from specified position in Linked List");
		node.deleteNode(3);
		node.printLinkedList();
	
		System.out.println("Deleting node from head in Linked List");
		node.deleteNodeAtStart();
		node.printLinkedList();
		
		System.out.println("Deleting node from tail in Linked List");
		node.deleteTailNode();
		node.printLinkedList();
		
		
	}

}
