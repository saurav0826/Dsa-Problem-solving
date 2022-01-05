package doublelinkedlist;


public class BasicMyDoublelinkedlist {
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
		
		
		System.out.println(head.data +" --> " + temp1.data+" --> "+temp2.data+" --> "+temp3.data);
		
	}
	
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}

}
