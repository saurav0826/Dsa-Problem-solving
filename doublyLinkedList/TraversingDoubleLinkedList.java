package doublelinkedlist;



public class TraversingDoubleLinkedList {

	public static void main (String[] args) {

		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3= new Node(50);
		head.prev=null;
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		temp2.next=temp3;
		temp3.prev=temp2;
		tranv(head);
		
	}
	static void tranv(Node head) {
		Node cur = head;
		while(cur!=null) {
			System.out.println(cur.data);
			cur=cur.next;
			
			
		}
	}
	
	static class Node{
		int data;
		Node next,prev;
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}
}
