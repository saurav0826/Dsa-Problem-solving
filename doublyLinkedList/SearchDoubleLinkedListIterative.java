package doublelinkedlist;


public class SearchDoubleLinkedListIterative {
	
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
		rec_tranv(head);
		System.out.println("  ");
		head=insertbeg(70,head);
		head=insertbeg(1000,head);
		rec_tranv(head);
	
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


	 static Node insertbeg(int i , Node head) {
			// TODO Auto-generated method stub
	      Node added = new Node(i);
	      added.next=head;
	      if(head!=null)
	    	  head.prev=added;
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
		Node next,prev;
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}
}
