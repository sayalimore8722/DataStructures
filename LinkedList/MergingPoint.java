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
	
	public createLinkedList mergingPoint(createLinkedList head,createLinkedList head1)
	{
		HashMap<createLinkedList,Integer> map=new HashMap<createLinkedList,Integer>();
		
		temp = head;
				
		while(temp != null)
		{
			map.put(temp, temp.data);
			temp = temp.next;
		}
		
		temp = head1;
		
		while(temp != null)
		{
			if(map.containsKey(temp) == true)
			{
				System.out.println("Merging Point : " + temp.data);
				break;
			}
			else
			{
				temp = temp.next;
			}
		}
		return head;
	}
}


public class MergingPoint {

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
		returnedHead1 = list1.createList(node11, 100);
		
		
		createLinkedList node12 = new createLinkedList();
		returnedHead1 = list1.createList(node12, 200);
		
		createLinkedList node23 = new createLinkedList();
		returnedHead1 = list1.createList(node23, 300);
		
		list1.printLinkedList(returnedHead1);
		
		returnedHead1.next.next.next=returnedHead.next.next.next.next;
		
		list1.printLinkedList(returnedHead1);
		
		list1.mergingPoint(returnedHead, returnedHead1);
	
		
		
	}
}
