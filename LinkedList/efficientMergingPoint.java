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
	
	public createLinkedList efficientMergingPoint(createLinkedList head,createLinkedList head1)
	{
		createLinkedList temp1 = null;
		int len1 = 0, len2 = 0;
		
		temp = head;
		
		while(temp != null)
		{
			len1 ++;
			temp = temp.next;
		}
		
		temp1 = head1;
		
		while(temp1 != null)
		{
			len2 ++;
			temp1 = temp1.next;
		}
		
		System.out.println("len 1 : " + len1);
		System.out.println("len 2 : " + len2);
		
		if(len1 > len2)
		{
			System.out.println("In If");
			temp = head;
			for(int i = 0; i<(len1 - len2); i++)
			{
				temp = temp.next;
			}
			System.out.println("Data : " + temp.data);
			temp1 = head1;
		}
		else
		{
			System.out.println("In else");
			temp1 = head1;
			for(int i = 0; i<(len2 - len1); i++)
			{
				temp1 = temp1.next;
			}
			System.out.println("Data : " + temp1.data);
			temp = head;
		}
		
	
		while(temp != temp1)
		{
			temp = temp.next;
			temp1 = temp1.next;
		}
		
		System.out.println("Merging Point : " + temp.data);
		return head;
	}
}


public class efficientMergingPoint {

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
		
		list1.efficientMergingPoint(returnedHead, returnedHead1);	
		
		
	}
}
