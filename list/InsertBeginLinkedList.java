package linkedlist;

import linkedlist.RecursiveTraversalLinkedList.Node;

public class InsertBeginLinkedList {
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
