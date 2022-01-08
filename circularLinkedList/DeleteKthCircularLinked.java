package circularLinkedList;

import circularLinkedList.DeleteHeadOFCIrcularLinked_2.Node;

public class DeleteKthCircularLinked {
	
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
		
		delk(2,head);
		ctranv(head);
		System.out.println();
		
		delk(7,head);
		ctranv(head);
		System.out.println();
		
		delk(1,head);
		ctranv(head);
		System.out.println();
		
		delk(4,head);
		ctranv(head);
		System.out.println();

		
		
		
	}
    static Node delh(Node head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }    
       
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
        
    }
	
     static void  delk(int k , Node head) {
	  if(head==null) {
		  return ;
	  }
	  if(k==1) {
		  delh(head);
		  return;
	  }
	  Node curr = head;
	  for(int i=0;i<k-2;i++)
		  if(curr==null)
			  return;
		  curr=curr.next;
	  if(curr==null)
		  return;
      curr.next=curr.next.next;
      return ;
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


