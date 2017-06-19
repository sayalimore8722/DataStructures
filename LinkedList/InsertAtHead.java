/*
Problem Statement:
You’re given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer,
insert this node at the head of the linked list and return the new head node. 
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

public class InsertAtHead {

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
		
	
		
	}

}
