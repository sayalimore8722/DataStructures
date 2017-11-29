/*
Problem Statement : Delete duplicate nodes from unsorted linked list
*/

import java.util.HashMap;


public class RD {

    public Node removeDup(Node head){
        Node temp = head, prev = head, compare = null, traverse = head;
         compare = temp.next;
         
         while(traverse != null)
         {
            System.out.print(traverse);
            System.out.println(" : " + traverse.data);
            traverse = traverse.next;
         }
         traverse = head;
         while(traverse != null)
         {
             if(compare != null)
                System.out.println("Outer while Compare Data : " + compare.data);
             System.out.println("Outer while Traverse Data : " + traverse.data);
             while(compare != null)
             {
                 temp = traverse;
                  System.out.println("Inner while Compare Data : " + compare.data);
                  System.out.println("Inner while Traverse Data : " + temp.data);
                  if(prev != null)
                    System.out.println("Inner while Prev Data : " + prev.data);
                 if(temp.data == compare.data)
                 {
                     System.out.println("Duplicate : " + compare.data);
                     System.out.println("Prev : " + prev.data);
                     System.out.println("Duplicate : " + compare);
                     System.out.println("Prev : " + prev);
                     System.out.println("Temp : " + temp);
                        prev.next = compare.next;
                        compare = prev;
                     
                 }
                     prev = compare;
                     //if(compare.next != null)                 
                     compare = compare.next;
                 
                 
             }
             
             traverse = traverse.next;
             prev = traverse;
             if((traverse != null) && (traverse.next != null))
                compare = traverse.next;
         }
         
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
        Node n = new Node(2);
        n.next = new Node(2);
        n.next.next = new Node(2);
        n.next.next.next = new Node(3);
        n.next.next.next.next = new Node(4);
        n.next.next.next.next.next = new Node(4);
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



