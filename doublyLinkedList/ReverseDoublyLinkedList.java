package doublelinkedlist;


public class ReverseDoublyLinkedList {

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
		insertend(70,head);
		insertend(1000,head);
		rec_tranv(head);
		head=revrese(head);
		System.out.println("  ");
		rec_tranv(head);
		
	}

	   static Node revrese(Node head) {
		// TODO Auto-generated method stub
//	if(head==null|head.next==null)
//		return head;
//	Node cur = head ;
//	Node temp=null;
//	while(cur !=null) {
//		temp=cur.next;
//		cur.next=cur.prev;
//		cur.prev=temp;
//		cur=cur.prev;
//	}
//	return temp.prev;
	
	Node temp = null;
    Node current = head;

    /* swap next and prev for all nodes of
     doubly linked list */
    while (current != null) {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
    }
    return temp.prev;
	   }
    /* Before changing head, check for the cases like
     empty list and list with only one node */
   

	static Node insertend(int i , Node head) {
			// TODO Auto-generated method stub
	      Node added = new Node(i);

         if(head==null)
        	 return added;
        Node cur = head;
         while(cur.next!=null) {
        	 cur=cur.next;
         }
         cur.next=added;
         added.prev=cur;
         return head;
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
		Node prev;
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}
}
