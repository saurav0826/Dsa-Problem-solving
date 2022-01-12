package doubleCircularLinkedList;


public class DoubleCircularLinkedListInsertEnd {

	 static class Node{
	        int data;
	        Node prev;
	        Node next;
	        Node(int d){
	            data=d;
	            prev=null;
	            next=null;
	        }
	    
	    public static void main(String args[]) 
	    { 
	        Node head=new Node(10);
	    	Node temp1=new Node(20);
	    	Node temp2=new Node(30);
	    	head.next=temp1;
	    	temp1.next=temp2;
	    	temp2.next=head;
	    	temp2.prev=temp1;
	    	temp1.prev=head;
	    	head.prev=temp2;
	    	printlist(head);
	    	System.out.println();
	    	endinsert(5,head);
	    	printlist(head);
	    	System.out.println();
	    	endinsert(3,head);
	    	printlist(head);
	    	System.out.println();
	    	endinsert(1,head);
	    	printlist(head);
	    	System.out.println();
	    } 
	    
	     static Node endinsert(int i, Node head) {
			// TODO Auto-generated method stub
			Node temp = new Node(i);
			if(head==null) {
				temp.next=temp;
				temp.prev=temp;
				return temp;
		}
			head.prev.next=temp;
			temp.prev=head.prev;
			temp.next=head;
			head.prev=temp;
			
			return head;
			
	     }

		 static void printlist(Node head){
	        if(head==null)return;
	        Node r=head;
	        do{
	            System.out.print(r.data+" ");
	            r=r.next;
	        }while(r!=head);
	    }
	}
}
