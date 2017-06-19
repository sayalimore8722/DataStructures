/*
Problem Statement :
You’re given the pointer to the head node of a linked list, an integer to add to the list and the position at which the integer
must be inserted. Create a new node with the given integer, insert this node at the desired position and return the head node. 
A position of 0 indicates head,a position of 1 indicates one node away from the head and so on. 
The head pointer given may be null meaning that the initial list is empty.
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


public class InsertAtPos {

	public static void main(String[] args) {
		
		System.out.println("Creating Linked List");
		NodeStructure node=new NodeStructure();
		NodeStructure n=node.createLinkedList(node,10);
		node.printLinkedList();

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
		
	
		
	}

}
