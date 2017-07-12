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
	

	
	public createLinkedList sortLinkedList(createLinkedList head)
	{
		createLinkedList current = null, current_next = null;
		int temp_val = 0;
		current = head;
		
		
		while(current != null)
		{
			current_next = current.next;
			while(current_next != null)
			{
				if(current.data > current_next.data)
				{	
					
					temp_val = current_next.data;
					current_next.data = current.data;				
					current.data = temp_val;			
				
				}
				
				current_next = current_next.next;
			}
			
			current = current.next;
		}
		return head;
	}
	
	
}


public class sortLinkedList {

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
		
		returnedHead = list.sortLinkedList(returnedHead);
		list.printLinkedList(returnedHead);
	
	}
}




