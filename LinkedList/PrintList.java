/*
Problem Statement:
Creating Linked List and printing elements of Linked List
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
		
		else
		{
			System.out.println("When head is not null");
			temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			
			node.value=data;	
			node.next=null;
			
			temp.next=node;
			System.out.println("Success");
		}
		return head; 
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



public class PrintList {

	public static void main(String[] args) {
		
		NodeStructure node=new NodeStructure();
		NodeStructure n=node.createLinkedList(node,10);
		node.printLinkedList();
		
		NodeStructure node1=new NodeStructure();
		NodeStructure n1=node.createLinkedList(node1,20);
		node.printLinkedList();
		
		NodeStructure node2=new NodeStructure();
		NodeStructure n2=node.createLinkedList(node2,30);
		node.printLinkedList();
		
	
		
	}

}
