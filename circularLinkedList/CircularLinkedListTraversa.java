package circularLinkedList;


public class CircularLinkedListTraversa {

	public static void main (String[] args) {
		Node head = new Node(10);
		Node temp=new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(50);

		head.next=temp;
		temp.next=temp2;
		temp2.next=temp3;
		temp3.next=head;
		
		
		ctranv(head);
		
	}
	
	 static void ctranv(Node head) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		 System.out.println(head.data);
		 for(Node cur=head.next;cur!=head;cur=cur.next) {
			 System.out.println(cur.data);
		 }
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
