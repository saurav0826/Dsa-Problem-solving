package circularLinkedList;


public class InsertAtEndCircularLinked_1 {
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
		System.out.println();
		insertb(5,head);
		ctranv(head);
		System.out.println();
		insertb(7,head);
		
		
		
		ctranv(head);
		
	}
	
	  static Node insertb(int i , Node head) {
		// TODO Auto-generated method stub
		  
		Node temp = new Node(i);
	if(head==null) {
		temp.next=temp;
		return temp;
	}
		
		Node cur = head;
		while(cur.next!=head) {
			cur=cur.next;
		}
		cur.next=temp;
		temp.next=head;
		return head;
		
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
