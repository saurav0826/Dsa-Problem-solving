package linkedlist;

public class BasicMylinkedlist {
	public static void main (String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next=temp1;
		temp2.next=temp2;
		
		System.out.println(head.data +" --> " + temp1.data+" --> "+temp2.data);
		
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
