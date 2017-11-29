/*
Problem Statement : Delete middle in the linked list
*/

import java.util.HashMap;


public class RD {

    public Node removeDup(Node head){
        Node slow = head, fast = head, prev = null;
	   
           while(fast != null && fast.next != null)
           {
               prev = slow;
               slow = slow.next;
               fast = fast.next;
               if(fast.next != null)
                    fast = fast.next;
               System.out.println("Slow : " + slow.data);
               System.out.println("Fast : " + fast.data);
           }
           
           
           prev.next = slow.next;
           
           return head;
   }
     
    public void display(Node head){
        Node n=head;
        while(n!=null){
            System.out.print("->" + n.data);
            n=n.next;
        }
    }
    public static void main(String args[]){
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(5);
        n.next.next.next.next.next = new Node(6);
        n.next.next.next.next.next.next = new Node(2);
        System.out.print("Original List : ");
        RD rm = new RD();
        rm.display(n);
        System.out.println("\n Updated List: ");
        Node x =rm.removeDup(n);
        rm.display(x);
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

