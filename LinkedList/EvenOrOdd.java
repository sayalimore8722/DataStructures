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
	
	public void evenOrOdd(createLinkedList head)
	{
		boolean flag = false;
		
		temp  = head;
		
		while(temp != null && temp.next != null)
		{
			temp = temp.next.next;
			
			if(temp == null)
			{
				flag = false;
			}
			
			else
			{
				flag = true;
			}
		}
		
		if(flag == true)
			System.out.println("List is odd");
		else if(flag == false)
			System.out.println("List is even");
	}	
}

public class LinkedListOperations {

	public static void main(String[] args)
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
		
		
		createLinkedList returnedHead1;
		createLinkedList list1 = new createLinkedList();
		
		createLinkedList node11 = new createLinkedList();
		returnedHead1 = list1.createList(node11, 15);
		
		
		createLinkedList node12 = new createLinkedList();
		returnedHead1 = list1.createList(node12, 22);
		
		createLinkedList node23 = new createLinkedList();
		returnedHead1 = list1.createList(node23, 300);
		
		createLinkedList node24 = new createLinkedList();
		returnedHead1 = list1.createList(node24, 400);
		
		list1.printLinkedList(returnedHead1);

	
		list.evenOrOdd(returnedHead);
		list1.evenOrOdd(returnedHead1);
		
		
		
	}
}


