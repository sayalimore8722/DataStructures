import java.util.HashMap;

public class createLinkedList {

	createLinkedList head;
	createLinkedList next;
	createLinkedList temp;
	
	int data;
	
	public createLinkedList()
	{
		head = null;
		next = null;
		data = 0;
	}
	
	public createLinkedList createList(createLinkedList node,int value)
	{
		createLinkedList current = null;
		
		if(head == null)
		{
			node.data = value;
			node.next = null;
			head = node;
		}
		else if(head != null)
		{
			temp = head;
			
			while(temp != null)
			{
				current = temp;
				temp = temp.next;

			}
			
			node.data = value;
			node.next = null;
			
			current.next = node;
		}
		return head;
	}
	
	
	public void printLinkedList(createLinkedList head)
	{
		if(head != null)
		{
			temp = head;
			
			while(temp != null)
			{
				System.out.println("Value : "+temp.data);
				temp = temp.next;
			}
		}
	}
	
	public createLinkedList insertInSortedList(createLinkedList head, createLinkedList node,int value)
	{
		createLinkedList prev = null;
		
		node.data = value;
		node.next = null;
		
		temp = head;
		
		while(temp != null)
		{
			if(temp.data < value)
			{
				prev = temp;
				temp = temp.next;

			}
			else
			{
				System.out.println("*************************");
				System.out.println("prev : "+prev.data);
				System.out.println("temp : "+temp.data);
				System.out.println("*************************");
				prev.next = node;
				node.next = temp;
				
				temp = temp.next;
			}
		}
		return head;
	}
}


public class searchLinkedList {

	public static void main(String args[])
	{
		createLinkedList returnedHead;
		createLinkedList list = new createLinkedList();
		
		createLinkedList node = new createLinkedList();
		returnedHead = list.createList(node, 50);
		
		
		createLinkedList node1 = new createLinkedList();
		returnedHead = list.createList(node1, 40);
		
		createLinkedList node2 = new createLinkedList();
		returnedHead = list.createList(node2, 30);
		
		
		createLinkedList node3 = new createLinkedList();
		returnedHead = list.createList(node3, 20);
		
		createLinkedList node4 = new createLinkedList();
		returnedHead = list.createList(node4, 10);
		
		list.printLinkedList(returnedHead);
		
		createLinkedList node5 = new createLinkedList();
		returnedHead = list.insertInSortedList(returnedHead, node5, 45);
		list.printLinkedList(returnedHead);
	}
}
