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

	public createLinkedList findCycle(createLinkedList head)
	{
		HashMap<createLinkedList,Integer> map = new HashMap<createLinkedList,Integer>();
	
		int count = 0, nodePos = 0;
		
		if(head == null)
		{
			System.out.println("Linked list is empty");
		}
		else
		{
			temp = head;
			
			while(temp !=  null)
			{
				Boolean flag = map.containsKey(temp);
				if(flag == true)
				{
					System.out.println("Cycle exists in the Linked List");
					break;
				}
				else
				{
				map.put(temp,temp.data);
				temp = temp.next;
				}
			}
			
		}
		return head;
	}
}



public class findCycle {

	public static void main(String args[])
	{
		createLinkedList returnedHead;
		createLinkedList list = new createLinkedList();
		
		createLinkedList node = new createLinkedList();
		returnedHead = list.createList(node, 10);
		
		
		createLinkedList node1 = new createLinkedList();
		returnedHead = list.createList(node1, 20);
		
		createLinkedList node2 = new createLinkedList();
		returnedHead = list.createList(node2, 30);
		
		
		createLinkedList node3 = new createLinkedList();
		returnedHead = list.createList(node3, 40);
		
		createLinkedList node4 = new createLinkedList();
		returnedHead = list.createList(node4, 50);
		
		list.printLinkedList(returnedHead);
		
		System.out.println("Loop data : "+(list.head.next.next.next.next).data);
		
    //Introduce loop in Linked List
    list.head.next.next.next.next = list.head;
		
    list.findCycle(returnedHead);
	}
}
