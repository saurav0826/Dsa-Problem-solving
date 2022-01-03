package linkedlist;

import linkedlist.DeleteFirstNodeLinkedList.Node;

public class DeleteLastLinkedList {
	
	public static void main (String[] args) {

		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(50);
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		rec_tranv(head);
		System.out.println("  ");
		insertend(70,head);
		insertend(1000,head);
		rec_tranv(head);
		System.out.println("  ");
		head=delfir(head);
		dellast(head);
		dellast(head);
		rec_tranv(head);
	}

	    static Node dellast(Node head) {
		// TODO Auto-generated method stub

	    	  if(head==null||head.next==null)
				   return null;
			  Node cur = head;
			  while(cur.next.next!=null) {
				  cur = cur.next;
			  }
			  cur.next=null;
			  return head;
	}

	static Node delfir(Node head) {
		// TODO Auto-generated method stub
		   if(head==null||head.next==null)
			   return null;
		  
		   return head.next;
		
	}

	static Node insertend(int i , Node head) {
			// TODO Auto-generated method stub
	      Node added = new Node(i);

         if(head==null)
        	 return added;
        Node cur = head;
         while(cur.next!=null) {
        	 cur=cur.next;
         }
         cur.next=added;
         return head;
		}

	static void rec_tranv(Node head) {
		// TODO Auto-generated method stub
		if(head==null) {
			return;
		}
		System.out.println(head.data);
		rec_tranv(head.next);
		}

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}

}
