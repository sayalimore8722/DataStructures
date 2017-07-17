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
	
	public createLinkedList splitLinkedList(createLinkedList head)
	{
		createLinkedList head_1 = null, head_2 = null, temp1 = null, new_head =  null, temp2 = null;
		int length = 0;
		
		temp = head;
		
		while(temp != null)
		{
			length ++;
			temp = temp.next;
		}
		
		System.out.println("Length : " + length);
		System.out.println("Length mid : " + (length / 2));

		
		if(length % 2 == 0)
		{
			System.out.println("In if");
			temp = head;
			int val_1 = 0, val_2 = 0;
			val_1 = length/2;
			val_2 = length;
			length = 0;
			temp1 = head_1;
			temp2 = head_2;
			
			
			System.out.println("val 1 : " + val_1);
			System.out.println("Before While");
			while(length < val_1)
			{
				System.out.println("In while");
				if(temp1 == null)
				{
					System.out.println("In if");
					System.out.println("temp prev : " + temp.data);
					temp1 = temp;
					head_1 = temp1;
					temp = temp.next;
					System.out.println("If temp1 : " + temp1.data);
					temp1.next = null;
					
					System.out.println("temp next : " + temp.data);
			
				}
				else
				{
					System.out.println("temp prev : " + temp.data);
					temp1.next = temp;
					System.out.println("temp1 prev : " + temp1.data);
					temp1 = temp1.next;
					temp = temp.next;
					System.out.println("temp1 after : " + temp1.data);
					temp1.next = null;
					
					System.out.println("temp after: " + temp.data);
				}
				length ++;
			}
			
			while(length < val_2)
			{
				

				System.out.println("In while");
				if(temp2 == null)
				{
					System.out.println("In if");
					System.out.println("temp prev : " + temp.data);
					temp2 = temp;
					head_2 = temp2;
					temp = temp.next;
					System.out.println("If temp1 : " + temp2.data);
					temp2.next = null;
					
					System.out.println("temp next : " + temp.data);
			
				}
				else
				{
					System.out.println("temp prev : " + temp.data);
					temp2.next = temp;
					System.out.println("temp1 prev : " + temp2.data);
					temp2 = temp2.next;
					temp = temp.next;
					System.out.println("temp1 after : " + temp2.data);
					temp2.next = null;
					
					
				}
				length ++;
			}
			
		}
		else
		{
			System.out.println("In if");
			temp = head;
			int val_1 = 0, val_2 = 0;
			val_1 = (length/2) + 1;
			val_2 = length;
			length = 0;
			temp1 = head_1;
			temp2 = head_2;
			
			
			System.out.println("val 1 : " + val_1);
			System.out.println("Before While");
			while(length < val_1)
			{
				System.out.println("In while");
				if(temp1 == null)
				{
					System.out.println("In if");
					System.out.println("temp prev : " + temp.data);
					temp1 = temp;
					head_1 = temp1;
					temp = temp.next;
					System.out.println("If temp1 : " + temp1.data);
					temp1.next = null;
					
					System.out.println("temp next : " + temp.data);
			
				}
				else
				{
					System.out.println("temp prev : " + temp.data);
					temp1.next = temp;
					System.out.println("temp1 prev : " + temp1.data);
					temp1 = temp1.next;
					temp = temp.next;
					System.out.println("temp1 after : " + temp1.data);
					temp1.next = null;
					
					System.out.println("temp after: " + temp.data);
				}
				length ++;
			}
			
			while(length < val_2)
			{
				

				System.out.println("In while");
				if(temp2 == null)
				{
					System.out.println("In if");
					System.out.println("temp prev : " + temp.data);
					temp2 = temp;
					head_2 = temp2;
					temp = temp.next;
					System.out.println("If temp1 : " + temp2.data);
					temp2.next = null;
					
					System.out.println("temp next : " + temp.data);
			
				}
				else
				{
					System.out.println("temp prev : " + temp.data);
					temp2.next = temp;
					System.out.println("temp1 prev : " + temp2.data);
					temp2 = temp2.next;
					temp = temp.next;
					System.out.println("temp1 after : " + temp2.data);
					temp2.next = null;
					
					
				}
				length ++;
			}
		}
		
		System.out.println("------------------------------------------");
		printLinkedList(head_1);

		System.out.println("------------------------------------------");
		printLinkedList(head_2);
		
		return head;
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
		
		returnedHead1 = list1.splitLinkedList(returnedHead1);
		System.out.println("************************************");
		returnedHead = list.splitLinkedList(returnedHead);
		
	
		
	}
}


