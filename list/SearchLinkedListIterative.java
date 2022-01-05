package linkedlist;

import linkedlist.InsertAtivenpositionLinkedList.Node;

public class SearchLinkedListIterative {
	
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
		head=insertbeg(70,head);
		head=insertbeg(1000,head);
		rec_tranv(head);
		insertgivnpos(head ,  2 , 60);
		insertgivnpos(head ,  7 , 5);
		insertgivnpos(head ,  20 , 60000);
		insertgivnpos(head ,  4 , 80);
		insertgivnpos(head ,  2 , 5);
		
		System.out.println("  ");
		rec_tranv(head);
		System.out.println("  ");
		searchI(5 , head);
		searchI(55 , head);
		searchI(1000 , head);
		searchI(50 , head);
	}

	   static void searchI(int i , Node head) {
		// TODO Auto-generated method stub
		Node cur = head;
		while(cur!=null) {
			if(cur.data==i) {
				System.out.println("true");
				return;
			}
			cur=cur.next;
		}
		System.out.println("false");
		return;
	}

	static Node insertgivnpos( Node head , int k  , int i ) {
		  Node cur = head;
		  Node temp=new Node(i);
		  if(k==1){
			  Node newNode = new Node(i);
	          newNode.next = head;
	          head = newNode;
	          return head;
		  }
		  else {
		  for(int j =1;j<=k-2&cur!=null;j++) {
			  cur=cur.next;
			  }
		  if(cur==null)
			  return null;
		  temp.next=cur.next;
		  cur.next=temp;
		  return head;
		  
	  }
	  }
	  
	  static Node insertbeg(int i , Node head) {
			// TODO Auto-generated method stub
	      Node added = new Node(i);
	      added.next=head;
	      return added;
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
