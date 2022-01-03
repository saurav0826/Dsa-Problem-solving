package linkedlist;

import linkedlist.BasicMylinkedlist.Node;

public class RecursiveTraversalLinkedList {
	public static void main (String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(50);
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
		rec_tranv(head);
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
