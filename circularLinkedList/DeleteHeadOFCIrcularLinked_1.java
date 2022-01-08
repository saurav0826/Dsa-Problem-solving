package circularLinkedList;


public class DeleteHeadOFCIrcularLinked_1 {
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
		head=delh(head);
		ctranv(head);
		System.out.println();
		head=delh(head);
		
		
		
		ctranv(head);
		
	}
	
	  static Node delh(Node head) {
		// TODO Auto-generated method stub
		  
	if(head==null | head.next==null) {
		return null;
	}
		
		Node cur = head;
		while(cur.next!=head) {
			cur=cur.next;
		}
		cur.next=head.next;
		return head.next;
		
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

