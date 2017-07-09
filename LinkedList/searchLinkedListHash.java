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
	
	
	public createLinkedList findNodeHash(createLinkedList head,int position)
	{
		HashMap<Integer,createLinkedList> map = new HashMap<Integer,createLinkedList>();
	
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
				map.put(count,temp);
				temp = temp.next;
				count ++;
			}
			
			System.out.println("Count : "+count);
			
			if(position > count)
			{
				System.out.println("List is smaller than specified position");
			}
			
			nodePos = count - position;
			
			System.out.println("Data is : "+(map.get(nodePos)).data);
			
		}
		return head;
	}
}


public class searchLinkedListHash {

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
		
		list.findNodeHash(returnedHead, 2);
	}
}
